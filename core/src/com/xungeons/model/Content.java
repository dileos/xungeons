package com.xungeons.model;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public interface Content {
	public void render(SpriteBatch batch);
	
	public void interact(Hero hero);
}
