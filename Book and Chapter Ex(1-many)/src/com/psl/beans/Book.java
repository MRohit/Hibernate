package com.psl.beans;

import java.util.HashSet;
import java.util.Set;

public class Book {
	public Book(int id, String name, Set<Chapters> book) {
		super();
		this.id = id;
		this.name = name;
		this.chapter = book;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int id;
	private String name;
	Set<Chapters> chapter=new HashSet<Chapters>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Chapters> getChapter() {
		return chapter;
	}
	public void setChapter(Set<Chapters> chapter) {
		this.chapter = chapter;
	}
	
	
	
}
