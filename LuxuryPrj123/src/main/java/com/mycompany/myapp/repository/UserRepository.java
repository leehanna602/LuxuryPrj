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
			vo.setUserId(rs.getString("user_id"));
			vo.setUserPassword(rs.getString("user_password"));
			vo.setUserName(rs.getString("user_name"));
			vo.setUserBirth(rs.getDate("user_date"));
			vo.setUserAddress(rs.getString("user_address"));
			vo.setUserPhone(rs.getString("user_phone"));
			vo.setUserSignup(rs.getDate("user_signup"));
			vo.setUserIsAdmin(rs.getInt("user_isadmin"));
			return vo;
		}			
	}
	
	@Override
	public UserVO getUserInfo(String userId) {
		String sql = "select *"
				+ "from users"
				+ "where =? ";		
		return jdbcTemplate.queryForObject(sql, new UserMapper(), userId);
	}
	
	@Override
	public void insertUser(UserVO vo) {
		String sql = "insert into USERS (user_id, user_password, user_name, user_date, user_address, user_phone, user_signup, user_isadmin)"
				+ "   values(?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql, vo.getUserId(),
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
				+ "set user_id=?, user_password=?, user_name=?, "
				+ "user_date=?, user_address=?, user_phone=?, "
				+ "user_signup=?, user_isadmin=?";
		jdbcTemplate.update(sql, vo.getUserId(),
								 vo.getUserPassword(),
								 vo.getUserName(),
								 vo.getUserBirth(),
								 vo.getUserAddress(),
								 vo.getUserPhone(), 
								 vo.getUserSignup(),
								 vo.getUserIsAdmin()
				);
		
	}

	@Override
	public void deleteUser(String userID, String userPassword) {
		String sql = "delete from where user_id=? and user_password=?";
		jdbcTemplate.update(sql, userID, userPassword);
	}

}
