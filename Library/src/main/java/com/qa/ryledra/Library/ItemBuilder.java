package com.qa.ryledra.Library;

import java.util.ArrayList;

public class ItemBuilder {
	private ArrayList<String> authors = new ArrayList<>();
	private String title;
	private String publisher;
	private String journalName;
	
	public Item itemBuilder(Library.itemTypes type)	{
		switch (type)	{
		case book:
			return new Book(this.authors, this.title, this.publisher);
		case journal:
			return new Journal(this.authors, this.title, this.journalName);
		default:
			return null;
		}
	}

	public ItemBuilder setTitle(String title) {
		this.title = title;
		return this;
	}

	public ItemBuilder setAuthors(ArrayList<String> authors) {
		this.authors = authors;
		return this;
	}
	
	public ItemBuilder setPublisher(String publisher)	{
		this.publisher = publisher;
		return this;
	}
	
	public ItemBuilder setJournalName(String journalName)	{
		this.journalName = journalName;
		return this;
	}
	
	public ItemBuilder addAuthor(String author)	{
		this.authors.add(author);
		return this;
	}
}
