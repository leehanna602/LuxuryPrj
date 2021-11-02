package com.mycompany.myapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.myapp.repository.IUserRepository;
import com.mycompany.myapp.vo.UserVO;

@Service
public class UserService implements IUserService {
	
	@Autowired
	IUserRepository userRepository;
	
	public void insertUser(UserVO vo) {
		userRepository.insertUser(vo);
	}

	@Override
	public UserVO getUserInfo(String userId) {
		return userRepository.getUserInfo(userId);
	}

	@Override
	public void updateUser(UserVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(String userID, String userPassword) {
		// TODO Auto-generated method stub
		
	}
}
