package mum.edu.booking_system.controller;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import mum.edu.booking_system.domain.User;
import mum.edu.booking_system.service.UserService;
import mum.edu.booking_system.util.Constants;

@Controller
@RequestMapping(value= {"Login"})
@SessionAttributes(Constants.USER_ATTRIBUTE)
public class LoginController {

	@Autowired
	UserService userService;
	
	@ModelAttribute("user")
	public User addUser() {
		return new User();
	}

	@RequestMapping(method=RequestMethod.GET)
	public String home(Model model) {
		return "index";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String login(@ModelAttribute("user") User user, Model model, HttpServletResponse response) {
		User authUser=userService.findByUserEmailAndPassword(user.getEmail(), user.getPassword());
		if(authUser==null) {
			model.addAttribute(Constants.INVALID_USERPASS, "Invalid email or password.");
			return "forward:/";
		}
		model.addAttribute(Constants.USER_ATTRIBUTE,authUser);
		
		return "redirect:/hotels/searchHotel";
	}
}
