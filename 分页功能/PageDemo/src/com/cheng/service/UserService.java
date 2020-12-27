package com.cheng.service;



import com.cheng.Bean.User;

public interface UserService {
	
	public boolean registerUser(User st) ;
	public User findUserByName(String name) ;
	public boolean login(User user) ;
}
