package com.mycompany.myapp.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insertUser(UserVO vo, Model model) {
		System.out.println(vo);
		userService.insertUser(vo);
		return "redirect:/user/index";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateUser(UserVO vo, Model model) {
		userService.updateUser(vo);		
		return "";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String deleteUser(String userId, String userPassword, Model model) {
		userService.deleteUser(userId, userPassword);;
		
		return "";
	}
	
	@RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
	public ModelAndView loginCheck(UserVO vo, Model model, HttpSession session) {
		boolean result = userService.loginCheck(vo, session);
		ModelAndView mav = new ModelAndView();
		if(result == true) {
			mav.setViewName("index");
			mav.addObject("msg", "success");
		} else {
			mav.setViewName("user/join");
			mav.addObject("msg", "false");
		}
		return mav;
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public ModelAndView logout(UserVO vo, Model model, HttpSession session) {
		userService.logout(session);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");mav.addObject("msg", "logout");
		return mav;
	}
	
	
	
	
}
