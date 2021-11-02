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

	@Inject
	SqlSession sqlSession; // mybatis 실행 객체
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public boolean loginCheck(UserVO vo) {
		String name = sqlSession.selectOne("admin.loginCheck", vo);
		return (name == null) ? false : true;
	}
	
	@Override
	public UserVO viewMember(UserVO vo) {
		return sqlSession.selectOne("admin.viewMember", vo);
	}

	@Override
	public void logout(HttpSession session) {
	}
	
	
}
