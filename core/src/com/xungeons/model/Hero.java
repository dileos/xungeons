package com.xungeons.model;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Hero extends Sprite implements Updatable {
	public Hero(Vector2 initialPosition) {
		super();
		this.setPosition(initialPosition.x, initialPosition.y);
		this.setRegion(AssetLoader.hero);
	}
	
	public void update(float delta) {
		//TODO
	}
	
	public void render(SpriteBatch batch) {
		batch.draw(AssetLoader.hero, this.getX(), this.getY());
	}
}
