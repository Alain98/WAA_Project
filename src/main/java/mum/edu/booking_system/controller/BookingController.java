/**
 * 
 */
package mum.edu.booking_system.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import mum.edu.booking_system.domain.Room_booking;
import mum.edu.booking_system.domain.Rooms;
import mum.edu.booking_system.domain.User;
import mum.edu.booking_system.service.RoomService;
import mum.edu.booking_system.service.Room_bookingService;
import mum.edu.booking_system.util.Constants;

/**
 * @author alain
 *
 */
@Controller
@RequestMapping("/booking")
@SessionAttributes("bookingSession")
public class BookingController {
	
	@Autowired
	RoomService roomService;
	
	@Autowired
	Room_bookingService room_bookingService;
	
	@RequestMapping(value="/room")
	public String bookRoom(@RequestParam("idh") Integer hotelId, @RequestParam("idr") Integer roomId, @ModelAttribute("booking") Room_booking booking, Model model ) {
		
		Room_booking bookingSession = new Room_booking();
		bookingSession.setHotelId(hotelId);
		bookingSession.setRoomId(roomId);
		model.addAttribute("bookingSession", bookingSession);
		
		return "book";
	}
	
	@RequestMapping(value="/room", method = RequestMethod.POST)
	public String saveBooking(@Valid @ModelAttribute("booking") Room_booking booking, 
			BindingResult results,
			@SessionAttribute("bookingSession") Room_booking bookingSession, 
			@SessionAttribute(Constants.USER_ATTRIBUTE) User user) {
		
		if(results.hasErrors()) {
			return "book";
		}
		else {
			Rooms room = roomService.findRoomById(bookingSession.getRoomId());
			room.setStatus("busy");
			roomService.save(room);
			
			booking.setUserId(user.getUserId());
			booking.setHotelId(bookingSession.getHotelId());
			booking.setRoomId(bookingSession.getRoomId());
			room_bookingService.save(booking);
			
			return "succes";
		}
	}
	
	@RequestMapping(value="/Logout", method=RequestMethod.GET)
	public String logout(HttpSession session, Model model) {
		session.invalidate();
		if(model.containsAttribute(Constants.USER_ATTRIBUTE)) 
			  model.asMap().remove(Constants.USER_ATTRIBUTE);
		return "redirect:/";
	}

}
