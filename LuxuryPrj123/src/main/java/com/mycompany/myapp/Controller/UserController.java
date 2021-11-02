package com.mycompany.myapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		
		return "user/index";
	}

	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {			
		
		return "user/join";
	}
}