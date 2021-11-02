package com.mycompany.myapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mycompany.myapp.vo.UserVO;

@Repository
public class UserRepository implements IUserRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	private class UserMapper implements RowMapper<UserVO> {
		@Override
		public UserVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			UserVO vo = new UserVO();
			vo.setUserId(rs.getString("UserId"));
			
			return vo;
		}			
	}
	
	@Override
	public UserVO getUserInfo(String userId) {
		String sql = "select  "
				+ "from "
				+ "where =?";		
		return jdbcTemplate.queryForObject(sql, new UserMapper(), userId);
	}
	
	@Override
	public void insertUser(UserVO vo) {
		String sql = "insert into USERS () values(?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql, vo.getUserNo(),
								 vo.getUserId(),
								 vo.getUserPassword(),
								 vo.getUserName(),
								 vo.getUserBirth(),
								 vo.getUserAddress(),
								 vo.getUserPhone(), 
								 vo.getUserSignup(),
								 vo.getUserIsAdmin());
	}

	@Override
	public void updateUser(UserVO vo) {
		String sql = "update  "
				+ "set first_name=?, last_name=?, email=?, "
				+ "phone_number=?, hire_date=?, job_id=?, "
				+ "salary=?, commission_pct=?, manager_id=?, "
				+ "department_id=? where employee_id=?";
		jdbcTemplate.update(sql, vo.getUserId()
				
				);
		
	}

	@Override
	public void deleteUser(String userID, String userPassword) {
		String sql = "delete from  where user_id=? and user_password=?";
		jdbcTemplate.update(sql, userID, userPassword);
	}

}
