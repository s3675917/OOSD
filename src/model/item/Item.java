package model.item;

import java.awt.image.BufferedImage;

import model.Position;

public abstract class Item {

	private int w;
	private int h;

	private BufferedImage img;
	private Position pos;

	public Item (BufferedImage img, Position pos, int w, int h) {
        this.img = img;
        this.pos = pos;
        this.w = w;
        this.h = h;
    }

	public int getWidth() {
		return w;
	}

	public int getHeight() {
		return h;
	}

	public BufferedImage getImg() {
		return img;
	}

	public Position getPos() {
		return pos;
	}

	public void setPos(Position pos) {
		this.pos = pos;
	}
	
	public void disappear() {//Disappear
		//do someting
	}

}
