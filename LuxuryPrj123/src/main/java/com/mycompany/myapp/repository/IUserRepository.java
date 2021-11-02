package com.mycompany.myapp.repository;

import com.mycompany.myapp.vo.UserVO;

public interface IUserRepository {
	UserVO getUserInfo(String userId);
	void insertUser(UserVO vo);
	void updateUser(UserVO vo);
	void deleteUser(String userID, String userPassword);
}
