/**
 * 
 */
package mum.edu.booking_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.edu.booking_system.domain.User;

@Controller
public class HomeController {
	
	@RequestMapping(value= {"/"})
	public String home(Model model) {
		model.addAttribute("user", new User());
		return "index";
	}
	
	@RequestMapping(value= {"/Login"}, method=RequestMethod.POST)
	public String login(@ModelAttribute("user") User user) {
		return "search";
	}

}
