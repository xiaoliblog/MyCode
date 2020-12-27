package com.cheng.dao;

import java.util.List;

import com.cheng.Bean.User;

public interface PageDao {
	public int getCount();
	public List<User> selectUserByPage(int begin, int pageSize);
}
