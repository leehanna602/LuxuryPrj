package com.mycompany.myapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.myapp.service.IAdminService;

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
	
	
}
