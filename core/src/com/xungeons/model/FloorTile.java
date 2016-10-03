package com.xungeons.model;

import com.badlogic.gdx.math.Vector2;

public class FloorTile extends GameSprite {

	public FloorTile(Vector2 position) {
		super(AssetLoader.floor, position);
	}
	
	public FloorTile(Vector2 position, Vector2 size) {
		super(AssetLoader.floor, position, size);
	}

	@Override
	public void interact(Hero hero) {
		// TODO Auto-generated method stub
		
	}

}
