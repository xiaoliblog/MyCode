package com.cheng.Bean;

import java.util.List;

public class Page {
	// 页码索引
	private int pageIndex;
	// 每页的容量
	private int pageSize;
	//  总页数
	private int pageCount;
	// 分页后的数据集合
	private List<?> dataList;
	// 数据总条数
	private int total;
	// 准备一个集合显示分页条数
	private int[] bar;
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public List<?> getDataList() {
		return dataList;
	}
	public void setDataList(List<?> dataList) {
		this.dataList = dataList;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int[] getBar() {
		return bar;
	}
	public void setBar(int[] bar) {
		this.bar = bar;
	}
	
	
}
