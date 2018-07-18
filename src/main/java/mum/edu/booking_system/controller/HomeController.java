/**
 * 
 */
package mum.edu.booking_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.edu.booking_system.domain.User;
import mum.edu.booking_system.service.HotelService;
import mum.edu.booking_system.service.Room_bookingService;

@Controller
public class HomeController {
	
	@Autowired
	Room_bookingService room_bookingService;
	
	@Autowired
	HotelService hotelService;
	
	@RequestMapping(value= {"/", "/home"})
	public String home(Model model) {
		model.addAttribute("user", new User());
		return "index";
	}
	
	@RequestMapping(value= {"/Login"}, method=RequestMethod.POST)
	public String login(@ModelAttribute("user") User user) {
		return "search";
	}
	
//	@RequestMapping(value= {"/admin"})
//	public String getAllReservations(Model model) {
//		model.addAttribute("bookings", room_bookingService.getAllRoom_booking());
//		model.addAttribute("attribute", hotelService.getHotelById(hotelId));
//		return "admin";
//	}

}
