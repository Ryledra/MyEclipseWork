package com.qa.ryledra.Library;

import java.util.HashMap;

public class Library {
	
	public enum itemTypes	{
		book, journal
	}
	
	//private ArrayList<Item> itemList = new ArrayList<>(); // use hashmap?
	private HashMap<Integer, Item> itemList = new HashMap<>();
	
	private int previousItemID = 0;
	
	public int getNewID()	{
		previousItemID++;
		return previousItemID;
	}
	
	public boolean dropItem(int itemID)	{
		if (itemList.remove(itemID) == null) return false;
		else return true;
	}

	public HashMap<Integer, Item> getItemList() {
		return itemList;
	}

	public int getPreviousItemID() {
		return previousItemID;
	}

	public void setPreviousItemID(int previousItemID) {
		this.previousItemID = previousItemID;
	}
}
