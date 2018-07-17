package mum.edu.booking_system.controller;

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
import mum.edu.booking_system.service.HotelService;
import mum.edu.booking_system.util.Utils;

@EnableSpringDataWebSupport
@Controller
public class HotelSearchController {
	
	@Autowired
	HotelService hotelService;

	 @RequestMapping(value = "/hotel/search")
	    public String getHotels(@RequestParam(value = "state", required = false) String state,
	                            @RequestParam(value = "city", required = false) String city,
	                            /*@RequestParam(value = "postcode", required = false) String postcode,
	                            Pageable pageable,*/ Model model) {
		 
		    Hotel h1 = new Hotel();
	    	Hotel h2 = new Hotel();
	    	Hotel h3 = new Hotel();
		 	Utils.initialise(h1, h2, h3);
		 	hotelService.save(h1);
		 	hotelService.save(h2);
		 	hotelService.save(h3);
		 
	        List<Hotel>/*Page<Hotel>*/ results = hotelService.getAllHotelsByLocation(state, city/*, postcode, pageable*/);
	        model.addAttribute("hotels", results);
	        return "hotels";
	    }
}
