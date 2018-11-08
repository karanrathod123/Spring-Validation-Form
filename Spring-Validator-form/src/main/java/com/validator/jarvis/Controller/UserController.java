package com.validator.jarvis.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.validator.jarvis.Model.User;
import com.validator.jarvis.Validator.UserValidator;

@Controller
public class UserController {

	@RequestMapping(value = "index")
	public String addUser(Model model) {
		model.addAttribute("registerCommand", new User());

		return "register";

	}

	@RequestMapping(value = "userAction", method = RequestMethod.POST)
	public String forwardAction(Model model,@ModelAttribute("registerCommand") @Validated User user,
			BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			System.out.println("hasErrors");
			model.addAttribute("user", user);		 					// user object
			return "register";	
		} else {
			System.out.println("successfully saved");
			model.addAttribute("success", "saved succesfully");
			return "register";
		}

	}

	@InitBinder("registerCommand")									//forwardAction and @InitBinder should be same
	public void formValid(WebDataBinder webDataBinder) {
		System.out.println("init");
		webDataBinder.setValidator(new UserValidator());
	}

}
