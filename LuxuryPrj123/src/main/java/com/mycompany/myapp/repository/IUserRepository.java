package com.mycompany.myapp.repository;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.mycompany.myapp.vo.ProductVO;
import com.mycompany.myapp.vo.UserVO;

public interface IUserRepository {
	UserVO getUserInfo(String userId);
	void insertUser(UserVO vo);
	void updateUser(UserVO vo);
	void deleteUser(String userID, String userPassword);
	boolean loginCheck(UserVO vo, HttpSession session);
	UserVO login(UserVO vo);
	void logout(HttpSession session);
	List<ProductVO> selectClothes();
}
