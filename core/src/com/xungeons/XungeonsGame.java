package com.xungeons;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.xungeons.model.AssetLoader;
import com.xungeons.model.GameScreen;

public class XungeonsGame extends Game {
	private GameScreen gameScreen;
	
	@Override
	public void create () {
		Gdx.app.log("Xungeons", "Created");
		AssetLoader.load();
		
		this.gameScreen = new GameScreen();
		this.setScreen(this.gameScreen);
	}
}
