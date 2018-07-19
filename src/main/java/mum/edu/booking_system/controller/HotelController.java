package mum.edu.booking_system.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mum.edu.booking_system.domain.Hotel;
import mum.edu.booking_system.domain.Rooms;
import mum.edu.booking_system.service.HotelService;
import mum.edu.booking_system.util.Utils;


@Controller
@RequestMapping("/hotels")
public class HotelController {
	
	@Autowired
	HotelService hotelService;
	
	@RequestMapping(value = "/room")
	public String getRooms(@RequestParam("id") Integer hotelId, Model model) {
		
		List<Rooms> rooms = new ArrayList<Rooms>();
		for(Rooms room : hotelService.getRoomsByHotelId(hotelId)) {
			if(room.getStatus().equals("available")) {
				rooms.add(room);
			}
		}
		model.addAttribute("hotel", hotelService.getHotelById(hotelId));
		model.addAttribute("rooms", rooms);
		return "rooms";
	}

	@RequestMapping(value="/searchHotel")
	public String searchHotel() {
		return "search";
	}
	
	 @RequestMapping(value = "/search")
	    public String getHotels(@RequestParam(value = "state", required = false) String state,
	                            @RequestParam(value = "city", required = false) String city,
	                            /*@RequestParam(value = "postcode", required = false) String postcode,
	                            Pageable pageable,*/ Model model) {
		 
		 
	        List<Hotel>/*Page<Hotel>*/ results = hotelService.getAllHotelsByLocation(state, city/*, postcode, pageable*/);
	        model.addAttribute("city", city);
	        model.addAttribute("hotels", results);
	        return "hotels";
	    }
	 
	 @RequestMapping(value="/contact")
	 public String displayContacts() {
		 return "contact";
	 }
	 
	 
	 @RequestMapping(value="/Login")
	 public String displaySearch() {
		 return "redirect:/hotels/searchHotel";
	 }
	 @RequestMapping(value="/about")
	 public String displayAbout() {
		 return "about";
	 }
}
