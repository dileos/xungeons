package com.xungeons;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.xungeons.model.AssetLoader;
import com.xungeons.model.GameScreen;

public class XungeonsGame extends Game {
	@Override
	public void create () {
		Gdx.app.log("Xungeons", "Created");
		AssetLoader.load();
		this.setScreen(new GameScreen());
	}
}
