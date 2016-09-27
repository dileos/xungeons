package com.xungeons.model;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Board 
{
	private Cell[][] board;
	private Hero hero;
	
	public Board(int size)
	{
		this.board = new Cell[size][size];
		this.hero = new Hero(new Vector2(50, 50));
	}
	
	public Cell getCellAt(int x, int y)
	{
		return this.board[x][y];
	}
	
	public void update(float time) {
		//TODO
	}
	
	public void render(SpriteBatch batch) {
		//TODO
		//TODO: ver por qu{e esto no anda y dibujarlo directamente con el batch sî.
		this.hero.render(batch);
	}
}
