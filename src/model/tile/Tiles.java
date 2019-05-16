package model.tile;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import model.Position;

public class Tiles {
    private int w;
    private int h;
    protected BufferedImage img;
    private Position pos;

    public void setW(int w) {
        this.w = w;
    }

    public void setH(int h) {
        this.h = h;
    }

    public Tiles(BufferedImage img, Position pos, int w, int h) {
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

    public void setImg(BufferedImage img){this.img = img;}

    public Position getPos() {
        return pos;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }

}
