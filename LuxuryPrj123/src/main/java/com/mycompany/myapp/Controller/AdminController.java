package com.mycompany.myapp.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.myapp.service.IAdminService;
import com.mycompany.myapp.vo.UserVO;

@Controller
public class AdminController {
	
	@Autowired
	IAdminService adminService;
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String adminIndex() {
		return "admin/adminIndex";
	}
	
	// 로그인 화면
	@RequestMapping(value = "/admin/login", method = RequestMethod.GET)
	public String adminLogin() {
		return "admin/login";
	}
	
	// 로그인 처리
	@RequestMapping(value = "/admin/loginCheck", method = RequestMethod.POST)
	public ModelAndView adminLoginAction(@ModelAttribute UserVO vo, HttpSession session) {
		boolean result = adminService.loginCheck(vo, session);
		ModelAndView mav = new ModelAndView();
		if(result == true) {
			// 로그인 성공시 index.jsp로 이동
			mav.setViewName("/admin/index");
			mav.addObject("msg", "success");
		}else { // 로그인 실패시 login.jsp로 이동
			mav.setViewName("/admin/login");
			mav.addObject("msg", "failure");
		}
		return mav;
	}

	// 로그아웃 처리
	@RequestMapping("/admin/logout")
	public ModelAndView logout(HttpSession session) {
		adminService.logout(session);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/admin/login");
		mav.addObject("msg", "logout");
		return mav;
	}
}
