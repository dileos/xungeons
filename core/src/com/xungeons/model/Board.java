package com.xungeons.model;

public class Board 
{
	private Cell[][] board;
	
	public Board(int size)
	{
		this.board = new Cell[size][size];
	}
	
	public Cell getCellAt(int x, int y)
	{
		return this.board[x][y];
	}
}
