package com.cheng.serviceImpl;

import java.util.List;

import com.cheng.Bean.Page;
import com.cheng.Bean.User;
import com.cheng.dao.PageDao;
import com.cheng.daoImpl.PageDaoImpl;
import com.cheng.service.PageService;

public class PageServiceImpl implements PageService {

	@Override
	public Page findUserByPage(int pageIndex) {
		PageDao pageDao = new PageDaoImpl() ;
		// 1、total总记录数
		int total = 0;
		List<User> dataList = null;
		total = pageDao.getCount();
		// 2、一页显示多少个数据
		int pageSize = 3;
		// 3、计算总页数
		int pageCount = total % pageSize == 0 ? (total / pageSize) : (total / pageSize) + 1;
		System.out.println("pageCount="+pageCount);
		// 当前页的开始检索的数据索引（start）为 （当前页码-1）*每页数据容量
		dataList = pageDao.selectUserByPage((pageIndex - 1) * pageSize, pageSize);
		// 封装数据
		Page page = new Page();
		page.setTotal(total);
		page.setPageCount(pageCount);
		page.setPageIndex(pageIndex);
		page.setDataList(dataList);
		page.setPageSize(pageSize);
		 
		return page;
	}

}
