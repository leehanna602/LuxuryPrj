package com.mycompany.myapp.service;

import com.mycompany.myapp.vo.UserVO;

public interface IUserService {
	UserVO getUserInfo(String userId);
	void insertUser(UserVO vo);
	void updateUser(UserVO vo);
	void deleteUser(String userID, String userPassword);
}
