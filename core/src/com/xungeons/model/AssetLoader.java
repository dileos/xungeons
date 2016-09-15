package com.xungeons.model;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class AssetLoader 
{
	public static Texture texture;
	public static TextureRegion hero;
	
	public static void load()
	{
		AssetLoader.texture = new Texture(Gdx.files.internal("sprites.jpg"));
		AssetLoader.texture.setFilter(TextureFilter.Nearest, TextureFilter.Nearest);
		
		AssetLoader.hero = new TextureRegion(AssetLoader.texture, 0, 0, 32, 64);
	    AssetLoader.hero.flip(false, true);
	}
	
	public static void dispose()
	{
		AssetLoader.texture.dispose();
	}
}
