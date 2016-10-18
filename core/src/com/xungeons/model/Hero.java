package com.xungeons.model;

import com.badlogic.gdx.math.Vector2;

public class Hero extends GameSprite implements Updatable {
	public Hero(Vector2 initialPosition) {
		super(AssetLoader.hero, initialPosition);
	}
	
	public Hero(Vector2 initialPosition, Vector2 size) {
		super(AssetLoader.hero, initialPosition, size);
	}
	
	public void update(float delta) {
		//TODO
	}

	@Override
	public void interact(Hero hero) {
		return;		
	}
	
	public boolean canWalkOver() {
		return false;
	}
}
