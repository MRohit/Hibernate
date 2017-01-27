package com.psl.beans;

import java.util.*;

public class Chapters {
	public Chapters(int pageNo, String name) {
		super();
		this.pageNo = pageNo;
		this.name = name;
	}
	public Chapters() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int pageNo;
	private String name;
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
