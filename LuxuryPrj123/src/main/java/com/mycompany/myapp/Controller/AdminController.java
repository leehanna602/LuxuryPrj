package com.mycompany.myapp.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mycompany.myapp.service.IAdminService;
import com.mycompany.myapp.vo.UserVO;

@Controller
public class AdminController {
	
	@Autowired
	@Qualifier("adservice")
	IAdminService adminService;
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String adminIndex() {
		return "admin/adminIndex";
	}
	
	// 로그인 화면
	@RequestMapping(value = "/admin/login", method = RequestMethod.GET)
	public String adminLoginForm() {
		return "admin/login";
	}
	
	// 로그인처리 - session 이용
	@RequestMapping(value = "/admin/login", method = RequestMethod.POST)
	public String adminLogin(UserVO vo, HttpSession session, RedirectAttributes rttr) throws Exception{
		System.out.println("login().vo : " + vo);
		
		// DB에서 입력한 정보에 맞는 데이터를 가져온다.
		UserVO userVO = adminService.adminLogin(vo);
		System.out.println("login().userVO : " + userVO);
		
		// userVO가 null : 아이디와 비밀번호가 틀려서 데이터를 가져올 수 없었다.
		
		if(userVO == null) {
			session.setAttribute("login", null);
			rttr.addFlashAttribute("msg", false);
			return "redirect:/admin/login";
		}
		
		// 실제적인 로그인 처리
		session.setAttribute("login", userVO);
		session.setAttribute("name", userVO.getUserName());
		return "redirect:/admin";
	}
	
	// 로그아웃
	@GetMapping("/admin/logout")
	public String logout(HttpSession session, RedirectAttributes rttr) {
		// 로그아웃 처리
		session.removeAttribute("login");
		// 메시지 처리 - 한번만
		rttr.addFlashAttribute("msg", "로그아웃이 되셨습니다.");
		return "redirect:/admin/login";
	}
	
	
	
}
