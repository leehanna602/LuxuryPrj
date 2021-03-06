package com.mycompany.myapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mycompany.myapp.vo.ProductVO;
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
	
	private class ProductMapper implements RowMapper<ProductVO> {
		@Override
		public ProductVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			ProductVO vo = new ProductVO();
			vo.setProductNo(rs.getInt("product_no"));
			vo.setProductCategoryNo(rs.getInt("product_category_no"));
			vo.setSallerUserId(rs.getString("saller_user_id"));
			vo.setProductName(rs.getString("product_name"));
			vo.setProductPrice(rs.getInt("product_price"));
			vo.setProductDescription(rs.getString("product_description"));
			vo.setProductSaleStatusId(rs.getInt("product_sale_status_id"));
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

	@Override
	public boolean loginCheck(UserVO vo, HttpSession session) {
		String sql = "select user_name as userName from users"
					+"where user_id=? and user_password=?";
		
		String name = jdbcTemplate.queryForObject(sql, String.class, vo.getUserName());
		return (name==null) ? false : true;
	}

	@Override
	public UserVO login(UserVO vo) {
		String sql = "select user_name as userName,"
					+"user_id as userId,"
					+"from users"
					+"where user_id=? and user_password=?";
		jdbcTemplate.update(sql, vo.getUserId(),
				 vo.getUserPassword()
				);
		return vo;
	}

	@Override
	public void logout(HttpSession session) {
		session.invalidate();
	}
	
	//????????? ??? ??? ?????? category_no 2??? ???
	@Override
	public List<ProductVO> selectClothes() {
		String sql = "select * from product where product_category_no = 2";
		
		return jdbcTemplate.query(sql, new ProductMapper());	
	}
	
	

}
