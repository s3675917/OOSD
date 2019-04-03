package model.blocks;

import model.Items;
import view.Vector2f;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ObjBlock extends Items {

    public ObjBlock(BufferedImage img, Vector2f pos, int w, int h) {
        super(img, pos, w, h);
    }


    public void render(Graphics2D g){
        super.render(g);
    }

}