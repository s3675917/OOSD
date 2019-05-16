package model.factories;

import java.awt.image.BufferedImage;

import model.Position;
import model.player.Player;
import model.spell.PlayerVisitor;
import model.tile.Tiles;

public interface Factory {
	Player createPlayer(Position pos,String type,String name);
	Tiles createTile(BufferedImage img, Position pos, int w,int h);
	PlayerVisitor createSkillVisitor(Player player);
}
