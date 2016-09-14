package com.xungeons.model;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

public class Hero extends Sprite {
	public Hero(Vector2 initialPosition) {
		super();
		this.setPosition(initialPosition.x, initialPosition.y);
	}
}
