package com.mycompany.myapp.repository;

import javax.servlet.http.HttpSession;

import com.mycompany.myapp.vo.UserVO;

public interface IAdminRepository {

	// 로그인 체크
	public boolean loginCheck(UserVO vo);

	// 로그인 정보
	public UserVO viewMember(UserVO vo);
	
	// 로그아웃
	public void logout(HttpSession session);
	
}
