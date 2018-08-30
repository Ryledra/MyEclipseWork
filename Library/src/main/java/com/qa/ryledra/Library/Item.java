package com.qa.ryledra.Library;

import java.util.ArrayList;

public abstract class Item {

	protected ArrayList<String> authors = new ArrayList<>();
	protected String title;
	
	public Item(ArrayList<String> authors, String title)	{
		this.authors = authors;
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Item [ authors=" + authors + ", title=" + title + "]";
	}
}
