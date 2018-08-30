package com.qa.ryledra.Library;

import java.util.ArrayList;

public class Book extends Item	{
	
	private String publisher;

	public Book (ArrayList<String> authors, String title, String publisher)	{
		super(authors, title);
		this.publisher = publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [publisher=" + publisher + ", authors=" + authors + ", title=" + title + "]";
	}

	public String getPublisher() {
		return publisher;
	}
	
}
