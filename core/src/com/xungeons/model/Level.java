package com.xungeons.model;

import com.badlogic.gdx.math.Vector2;

public class Level {
	private Board board;
	private Hero hero;
	
	public Level(Board board) { 
		this.board = board;
		this.hero = new Hero(new Vector2(0, 0));
	}

	public void update(float delta) {
		this.hero.update(delta);
	}
	
	public Board getBoard() {
		return board;
	}

	public Hero getHero() {
		return hero;
	}
}
