package com.mycompany.myapp.service;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mycompany.myapp.dao.AdminMapper;
import com.mycompany.myapp.vo.UserVO;

@Service
@Qualifier("adservice")
public class AdminService implements IAdminService{
	
	@Inject
	private AdminMapper mapper;

	// 로그인 처리
	@Override
	public UserVO adminLogin(UserVO vo) {
		return mapper.adminLogin(vo);
	}




}
