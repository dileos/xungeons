package com.xungeons.model;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Cell 
{
	public static final int SIZE = 40;
	
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
	
	public void render(SpriteBatch batch) {
		this.content.render(batch);
	}
}
