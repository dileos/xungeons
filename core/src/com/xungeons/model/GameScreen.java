package com.xungeons.model;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen implements Screen {
	Board board;
	
	OrthographicCamera camera;
	SpriteBatch spriteBatch;
	
	
	public GameScreen() {
		this.board = new Board(20);
		this.spriteBatch = new SpriteBatch();
		
		this.camera = new OrthographicCamera();
		this.camera.setToOrtho(true, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		
		this.spriteBatch.setProjectionMatrix(this.camera.combined);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		//TODO: update board
		
		Gdx.gl.glClearColor(0.7f, 0, 0.7f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		this.spriteBatch.begin();
		this.spriteBatch.enableBlending();
		this.board.render(spriteBatch);
		this.spriteBatch.end();		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	public float getBoardSize() {
		return board.getSizeInPixels();
	}
}
