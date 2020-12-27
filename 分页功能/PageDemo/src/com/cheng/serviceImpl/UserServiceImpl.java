package com.cheng.serviceImpl;

import java.sql.SQLException;

import com.cheng.Bean.User;
import com.cheng.dao.UserDao;
import com.cheng.daoImpl.UserDaoImpl;
import com.cheng.service.UserService;

public class UserServiceImpl implements UserService {

	public boolean registerUser(User user) {
		boolean flag = false ;
		UserDao stDao = new UserDaoImpl() ;
		try {
			flag = stDao.insert(user) ;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public User findUserByName(String name) {
		UserDao userDao = new UserDaoImpl() ;
		User user = new User() ;
		try {
			user = userDao.selectUserByName(name) ;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public boolean login(User user) {
		// TODO Auto-generated method stub
		UserDao userDao = new UserDaoImpl() ;
		Boolean flag = userDao.selectPasswordByName(user);
		return flag;
	}

}
