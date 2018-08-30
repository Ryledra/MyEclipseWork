package com.qa.ryledra.Library;

import static org.junit.Assert.*;

//import java.util.ArrayList;

//import org.junit.Ignore;
import org.junit.Test;

public class TestRunner {

	
	@Test
	public void checkOutItem()	{
		fail();
	}
	
	@Test
	public void checkInItem()	{
		fail();
	}
	
	@Test
	public void addItem()	{
		
		Library lib = new Library();
		
		// book 
		Item b1 = new ItemBuilder().addAuthor("Mitch Connor").setTitle("how to rule the world").setPublisher("Collins").itemBuilder(Library.itemTypes.book);
		lib.getItemList().put(lib.getNewID(), b1);
		// book assert
		assertEquals(b1, lib.getItemList().get(lib.getPreviousItemID()));
		
		// journal
		Item j1 = new ItemBuilder().addAuthor("Mitch Connor").setTitle("ruling the world: 7 easy steps").setJournalName("Evil").itemBuilder(Library.itemTypes.journal);
		lib.getItemList().put(lib.getNewID(), j1);
		// journal assert
		assertEquals(j1, lib.getItemList().get(lib.getPreviousItemID()));
	}
	
	@Test
	public void removeItem()	{
		Library lib = new Library();
		
		// book 
		Item b1 = new ItemBuilder().addAuthor("Mitch Connor").setTitle("how to rule the world").setPublisher("Collins").itemBuilder(Library.itemTypes.book);
		lib.getItemList().put(lib.getNewID(), b1);
		int itemID = lib.getPreviousItemID();
		lib.dropItem(itemID);
		assertNull(lib.getItemList().get(lib.getPreviousItemID()));
	}
	
	@Test
	public void updateItem()	{
		fail();
	}
	
	@Test
	public void registerPerson()	{
		fail();
	}
	
	@Test
	public void deletePerson()	{
		fail();
	}
	
	@Test
	public void updatePerson()	{
		fail();
	}
	
	@Test
	public void saveToFile()	{
		fail();
	}
	
	@Test
	public void retrieveFromFile()	{
		fail();
	}
	
}
