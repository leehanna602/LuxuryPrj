package com.mycompany.myapp.service;

import javax.servlet.http.HttpSession;

import com.mycompany.myapp.vo.UserVO;

public interface IAdminService {
	public boolean loginCheck(UserVO vo, HttpSession session);
	public UserVO viewMember(UserVO vo);
	public void logout(HttpSession session);
	
}
