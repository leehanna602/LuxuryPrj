package com.mycompany.myapp.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp.repository.IAdminRepository;
import com.mycompany.myapp.vo.UserVO;

@Service
public class AdminService implements IAdminService{
	@Autowired
	IAdminRepository adminRepository;

	// 로그인 체크
	@Override
	public boolean loginCheck(UserVO vo, HttpSession session) {
		boolean result = adminRepository.loginCheck(vo);
		if(result) {
			UserVO vo2 = viewMember(vo);
			//세션변수 등록
			session.setAttribute("userId", vo2.getUserId());
			session.setAttribute("userName", vo2.getUserName());
		}
		return result;
	}

	// 로그인 정보
	@Override
	public UserVO viewMember(UserVO vo) {
		return adminRepository.viewMember(vo);
	}

	//로그아웃
	@Override
	public void logout(HttpSession session) {
		session.invalidate();
		
	}

}
