package com.mycompany.myapp.repository;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mycompany.myapp.vo.UserVO;

@Repository
public class AdminRepository implements IAdminRepository {

	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public boolean loginCheck(UserVO vo) {
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
