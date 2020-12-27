package com.cheng.dao;

import java.sql.SQLException;

import com.cheng.Bean.User;

public interface UserDao {
	////檢查用戶名和密碼是否匹配
	public boolean selectPasswordByName(User user) ;
	//插入数据
	public Boolean insert(User user) throws SQLException ;
	// 根据用户名称返回对象
	public User selectUserByName(String name) throws SQLException ;
}
