package model.factories;

import java.awt.image.BufferedImage;

import model.Position;
import model.player.Player;
import model.spell.PlayerVisitor;
import model.tile.Tiles;

public class FactoryAdaptor implements Factory {

	@Override
	public Player createPlayer(Position pos, String type, String name) {
		return null;
	}

	@Override
	public Tiles createTile(BufferedImage img, Position pos, int w, int h) {
		return null;
	}

	@Override
	public PlayerVisitor createSkillVisitor(Player player) {
		return null;
	}
	
}
