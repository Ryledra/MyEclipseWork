package com.qa.ryledra.Library;

import java.util.ArrayList;

public abstract class Item {

	protected ArrayList<String> authors = new ArrayList<>();
	protected String title;
	
	public Item(ArrayList<String> authors, String title)	{
		this.authors = authors;
		this.title = title;
	}
	
	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Item [ authors=" + authors + ", title=" + title + "]";
	}
}
