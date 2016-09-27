package com.xungeons;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.xungeons.model.AssetLoader;
import com.xungeons.model.GameScreen;

public class XungeonsGame extends Game {
	SpriteBatch batch;
	TextureRegion img;
	
	@Override
	public void create () {
		Gdx.app.log("Xungeons", "Created");
		AssetLoader.load();
		this.setScreen(new GameScreen());
		//batch = new SpriteBatch();
		img = AssetLoader.hero;
	}
	
//	@Override
//	public void render () {
//		Gdx.gl.glClearColor(1, 0, 0, 1);
//		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//		batch.begin();
//		batch.draw(img, 0, 0);
//		batch.end();
//	}
}
