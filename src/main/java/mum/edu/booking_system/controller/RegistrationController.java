package mum.edu.booking_system.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import mum.edu.booking_system.domain.User;
import mum.edu.booking_system.service.UserService;

@Controller
@RequestMapping(value= {"Registration"})
public class RegistrationController {
	@Autowired
	UserService userService;
	
	@ModelAttribute("user")
	public User addUser() {
		return new User();
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String registrationForm(Model model) {
		return "registration";
	}
	
	@PostMapping("/user")
    public String submitForm(@Valid User user, 
      BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "registration";
        }
        return "registration";
    }
	
	@RequestMapping(method=RequestMethod.POST)
	public String registration(@Valid @ModelAttribute("user") User user, BindingResult result,
			RedirectAttributes redirectAttributes, Model model) {
		
		if(result.hasErrors()) {
			for (Object object : result.getAllErrors()) {
			    if(object instanceof ObjectError) {
			        ObjectError objectError = (ObjectError) object;
			        if(objectError.getCodes().length>1)
			        	if(objectError.getCodes()[1].equals("FieldsValueMatch"))
			        		model.addAttribute("confirmPasswordErr",objectError.getDefaultMessage());
			    }
			}
			return "registration";
		}
		redirectAttributes.addFlashAttribute("user", user);
		userService.save(user);
		return "redirect:/";
	}
}
