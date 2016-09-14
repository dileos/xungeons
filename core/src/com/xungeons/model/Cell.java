package com.xungeons.model;

public class Cell 
{
	private Content content;
	
	public Cell(Content content)
	{
		this.content = content;
	}

	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}
}
