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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import mum.edu.booking_system.domain.User;
import mum.edu.booking_system.service.HotelService;
import mum.edu.booking_system.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	UserService userService;
	
	boolean isDefaultDataAdd=false;

	@RequestMapping(value= {"/"})
	public String home(Model model) {
		model.addAttribute("user", new User());
		
		if(!isDefaultDataAdd) {
			userService.initialiseUsersInDatabase();
			isDefaultDataAdd=true;
		}
		return "index";
	}
	
}
