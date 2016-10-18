package com.xungeons.model;

import com.badlogic.gdx.math.Vector2;

public class WallTile extends GameSprite {

	public WallTile(Vector2 position) {
		super(AssetLoader.wall, position);
	}
	
	public WallTile(Vector2 position, Vector2 size) {
		super(AssetLoader.wall, position, size);
	}

	@Override
	public void interact(Hero hero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean canWalkOver() {
		return false;
	}

}
