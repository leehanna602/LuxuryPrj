package com.mycompany.myapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.myapp.service.IUserService;
import com.mycompany.myapp.vo.UserVO;

@Controller
public class UserController {

	@Autowired
	IUserService userService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		
		return "user/index";
	}

	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {			
		
		return "user/join";
	}
	
	@RequestMapping(value = "/user/insert", method = RequestMethod.POST)
	public String insertEmp(UserVO vo, Model model) {
		System.out.println(vo);
		userService.insertUser(vo);
		return "redirect:/user/index";
	}
	
	@RequestMapping(value = "/user/update", method = RequestMethod.GET)
	public String updateEmp(String userId, Model model) {
		model.addAttribute("UserVO", userService.getUserInfo(userId));
		
		return "hr/updateform";
	}
}
