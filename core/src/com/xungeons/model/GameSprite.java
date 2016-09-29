package com.xungeons.model;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

public abstract class GameSprite {
	protected Vector2 position;
	//protected Vector2 size;
	
	protected TextureRegion texture;
	
	public GameSprite(TextureRegion texture, Vector2 position) {
		this.texture = texture;
		this.position = position;
	}
	
	public Vector2 getPosition() {
		return this.position;
	}
	public void setPosition(Vector2 position) {
		this.position = position;
	}
	
	public float getX() {
		return this.position.x;
	}
	public void setX(float x) {
		this.position.x = x;
	}
	
	public float getY() {
		return this.position.y;
	}
	public void setY(float y) {
		this.position.y = y;
	}
	
	public float getWidth() {
		return this.texture.getRegionWidth();
	}
//	public void setWidth(float width) {
//		this.size.x = width;
//	}
	
	public float getHeight() {
		return this.texture.getRegionHeight();
	}
//	public void setHeight(float height) {
//		this.size.y = height;
//	}
	
	public TextureRegion getTexture() {
		return this.texture;
	}
	public void settexture(TextureRegion texture) {
		this.texture = texture;
	}
	
	public void render(SpriteBatch batch) {
		batch.draw(this.texture, this.getX(), this.getY());
	}
}
