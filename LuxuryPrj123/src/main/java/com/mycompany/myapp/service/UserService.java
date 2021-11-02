package com.mycompany.myapp.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp.repository.IUserRepository;
import com.mycompany.myapp.vo.ProductVO;
import com.mycompany.myapp.vo.UserVO;

@Service
public class UserService implements IUserService {
	
	@Autowired
	IUserRepository userRepository;
	
	@Override
	public UserVO getUserInfo(String userId) {
		return userRepository.getUserInfo(userId);
	}
	
	public void insertUser(UserVO vo) {
		userRepository.insertUser(vo);
	}

	@Override
	public void updateUser(UserVO vo) {
		userRepository.updateUser(vo);
	}

	@Override
	public void deleteUser(String userID, String userPassword) {
		userRepository.deleteUser(userID, userPassword);
	}

	@Override
	public boolean loginCheck(UserVO vo, HttpSession session) {
		boolean result = userRepository.loginCheck(vo, session);
		if(result) {
			UserVO vo2 = login(vo);
			session.setAttribute("userId", vo2.getUserId());
			session.setAttribute("userName", vo.getUserName());
		}
		return result;
	}

	@Override
	public UserVO login(UserVO vo) {
		return userRepository.login(vo);
	}

	@Override
	public void logout(HttpSession session) {
		userRepository.logout(session);
	}

	//윤민우 옷 검색
	@Override
	public List<ProductVO> selectClothes() {
		return userRepository.selectClothes();
	}
	
	
}
