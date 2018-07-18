/**
 * 
 */
package mum.edu.booking_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import mum.edu.booking_system.domain.Room_booking;
import mum.edu.booking_system.domain.Rooms;
import mum.edu.booking_system.service.RoomService;
import mum.edu.booking_system.service.Room_bookingService;

/**
 * @author alain
 *
 */
@Controller
@RequestMapping("/booking")
public class BookingController {
	
	@Autowired
	RoomService roomService;
	
	@Autowired
	Room_bookingService room_bookingService;
	
	@RequestMapping(value="/room")
	public String bookRoom(@RequestParam("idh") Integer hotelId, @RequestParam("idr") Integer roomId, Model model ) {
		
		Room_booking booking = new Room_booking();
		booking.setHotelId(hotelId);
		booking.setRoomId(roomId);
		model.addAttribute("booking", booking);
		
		return "book";
	}
	
	@RequestMapping(value="/room", method = RequestMethod.POST)
	public String saveBooking(@ModelAttribute("booking") Room_booking booking) {
		
		Rooms room = roomService.findRoomById(booking.getRoomId());
		room.setStatus("busy");
		roomService.save(room);
		
		//*****Put the userId in the session here
		booking.setUserId(1);
		//***** 
		room_bookingService.save(booking);
		
		return "succes";
	}

}
