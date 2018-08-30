package com.qa.ryledra.Library;

import java.util.ArrayList;

public class Journal extends Item {
	
	private String journalName;

	public Journal(ArrayList<String> authors, String title, String journalName) {
		super(authors, title);
		this.journalName = journalName;
	}

	public String getJournalName() {
		return journalName;
	}

	public void setJournalName(String journalName) {
		this.journalName = journalName;
	}

}
