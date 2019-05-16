package model.factories;

import java.awt.image.BufferedImage;

import model.Position;
import model.tile.Door;
import model.tile.Floor;
import model.tile.Tiles;
import model.tile.Trap;
import model.tile.Wall;

public class TileFactory extends FactoryAdaptor {

	@Override
	public Tiles createTile(BufferedImage img, Position pos, int w,int h) {
		Tiles floor = new Floor(img, pos, w, h);
		return floor;
		

	}
	
	public Tiles createTile(Tiles floor,String t) {
		String type = t.toLowerCase();
//		switch (type) {
//		case "door":
//			Tiles door = new Door(new Wall(floor));
//			return door;
//		case "wall":
//			Tiles wall = new Wall(floor);
//			return wall;
//		case "trap":
//			Tiles trap = new Trap(floor);
//			return trap;
//		default:
//			return null;
//		}
		return floor;
		
	}
}
