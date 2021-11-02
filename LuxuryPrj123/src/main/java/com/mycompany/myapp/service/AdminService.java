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

	@Override
	public boolean loginCheck(UserVO vo, HttpSession session) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserVO viewMember(UserVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void logout(HttpSession session) {
		// TODO Auto-generated method stub
		
	}



}
