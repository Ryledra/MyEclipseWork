package com.qa.ryledra.Library;

import java.util.ArrayList;

public class ItemBuilder {
	private ArrayList<String> authors = new ArrayList<>();
	private String title;
	
	public Item itemBuilder(Library.itemTypes type)	{
		return new Book(this.authors, this.title);
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}
}
