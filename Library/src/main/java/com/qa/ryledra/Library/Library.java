package com.qa.ryledra.Library;

import java.util.ArrayList;

public class Library {
	
	public enum itemTypes	{
		book, journal
	}
	
	private ArrayList<Item> itemList = new ArrayList<>(); // use hashmap?
	private int previousItemID = 0;
	
	

	public ArrayList<Item> getItemList() {
		return itemList;
	}

	public int getPreviousItemID() {
		return previousItemID;
	}

	public void setPreviousItemID(int previousItemID) {
		this.previousItemID = previousItemID;
	}
}