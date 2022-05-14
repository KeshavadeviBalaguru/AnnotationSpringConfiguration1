package com.java;

import org.springframework.beans.factory.annotation.Autowired;

public class Library {
	@Autowired
	private Note mynote;

	public Note getMynote() {
		return mynote;
	}

	public void setMynote(Note mynote) {
		this.mynote = mynote;
	}
	public void studymaterial()
	{
		System.out.println("Java Book Available...");
		mynote.Materials();
	}

}
