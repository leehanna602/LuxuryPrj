package com.mycompany.myapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp.repository.IUserRepository;
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
}
