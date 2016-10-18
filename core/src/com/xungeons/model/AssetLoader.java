package com.xungeons.model;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class AssetLoader 
{
	public static Texture texture;
	public static TextureRegion hero;
	
	public static Texture floorTexture;
	public static TextureRegion floor;
	
	public static Texture wallTexture;
	public static TextureRegion wall;
	
	public static void load()
	{
		AssetLoader.texture = new Texture(Gdx.files.internal("sprites.png"));
		AssetLoader.texture.setFilter(TextureFilter.Nearest, TextureFilter.Nearest);
		
		AssetLoader.hero = new TextureRegion(AssetLoader.texture, 190, 16, 86, 82);
	    AssetLoader.hero.flip(false, true);
	    
	    AssetLoader.floorTexture = new Texture(Gdx.files.internal("Dirt.png"));
		AssetLoader.floorTexture.setFilter(TextureFilter.Nearest, TextureFilter.Nearest);
		
		AssetLoader.floor = new TextureRegion(AssetLoader.floorTexture, 0, 0, 20, 20);
	    AssetLoader.floor.flip(false, true);
	    
	    AssetLoader.wallTexture = new Texture(Gdx.files.internal("Wall_library.png"));
		AssetLoader.wallTexture.setFilter(TextureFilter.Nearest, TextureFilter.Nearest);
		
		AssetLoader.wall = new TextureRegion(AssetLoader.wallTexture, 0, 0, 20, 20);
	    AssetLoader.wall.flip(false, true);
	}
	
	public static void dispose()
	{
		AssetLoader.texture.dispose();
	}
}
