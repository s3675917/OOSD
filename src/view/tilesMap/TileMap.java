package view.tilesMap;/*
 * *@Date:  2019-03-23
 * *@author:  Biao Li
 * *StudentID :  s3675917
 * *@ver 1.0
 * */

import model.Position;
import model.tile.Tiles;
import model.tile.Trap;
import view.utils.Sprite;

public class TileMap {
    private Tiles[] blocks;
    private Sprite sprite;
    public TileMap(String data, Sprite sprite, int width, int height, int tileWidth, int tileHeight, int tileColumns) {
        this.sprite = sprite;
        blocks = new Tiles[width * height];
        for (Tiles t : blocks
        ) {
            t = null;
        }

        if (data != null) {
            String[] block = data.split(",");
            int sprite_x;
            int sprite_y;
            int draw_location_x;
            int draw_location_y;
            for (int i = 0; i < (width * height); i++) {
                int temp = Integer.parseInt(block[i].replaceAll("\\s+", ""));
                if (temp != 0) {
                    sprite_x = (temp - 1) % tileColumns;
                    sprite_y = (temp - 1) / tileColumns;
                    draw_location_x = (i % width) * tileWidth;
                    draw_location_y = (i / width) * tileHeight;

                    blocks[i] = new Tiles(sprite.getSprite(sprite_x, sprite_y), new Position(draw_location_x, draw_location_y), tileWidth, tileHeight);
                }
            }
        }
    }

    public Tiles[] getBlocks() {
        return blocks;
    }

    public boolean breakWall(int target) {
        if (blocks[target] != null) {
            blocks[target] = null;
            return true;
        } else return false;
    }


    public boolean wallAhead(int targetValue) {
        if (blocks[targetValue] != null) {
            return true;
        } else
            return false;
    }

    public void addTile(Trap trap) {
        trap.setImg(sprite.getSprite(1,1));
        Position pos = new Position(trap.getPos().getX() * 32, trap.getPos().getY()*32);
        trap.setH(32);
        trap.setW(32);
        int seq = trap.getPos().getSeq();
        trap.setPos(pos);
        blocks[seq] = trap;

    }
}