package com.xungeons.model;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Board 
{	
	private int size;
	private Cell[][] board;
	private Hero hero;
	
	private int[] heroPosition;
	
	public Board(int size)
	{
		this.size = size;
		this.heroPosition = new int[2];
		this.heroPosition[0] = 0;
		this.heroPosition[1] = 0;
		
		this.board = new Cell[size][size];
		this.hero = new Hero(new Vector2(50, 50));
		
		this.initializeBoard();
	}
	
	private void initializeBoard() {
		FloorTile tile;
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				tile = new FloorTile(new Vector2(i * Cell.SIZE, j * Cell.SIZE), new Vector2(Cell.SIZE, Cell.SIZE));
				board[i][j] = new Cell(tile);
			}
		}
	}
	
	public Cell getCellAt(int x, int y)
	{
		return this.board[x][y];
	}
	
	public void update(float time) {
		//TODO
	}
	
	public void onKeyPress() {
		//TODO
	}
	
	public void render(SpriteBatch batch) {
		//TODO
		//TODO: ver por que esto no anda y dibujarlo directamente con el batch sî.
		//this.hero.render(batch);
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++)
				board[i][j].render(batch);
		
		hero.render(batch);
	}
	
	public float getSizeInPixels() {
		return this.size * Cell.SIZE;
	}
}
