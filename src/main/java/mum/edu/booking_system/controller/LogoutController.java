package mum.edu.booking_system.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.edu.booking_system.util.Constants;

@Controller
@RequestMapping(value= {"hotels/Logout"})
public class LogoutController {

	@RequestMapping(method=RequestMethod.GET)
	public String logout(HttpSession session, Model model) {
		session.invalidate();
		if(model.containsAttribute(Constants.USER_ATTRIBUTE)) 
			  model.asMap().remove(Constants.USER_ATTRIBUTE);
		return "redirect:/";
	}
}
