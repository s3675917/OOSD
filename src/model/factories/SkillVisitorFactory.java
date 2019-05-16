package model.factories;

import model.player.Player;
import model.spell.ArrestVisitor;
import model.spell.BreakWallVisitor;
import model.spell.PlaceTrapVisitor;
import model.spell.PlayerVisitor;

public class SkillVisitorFactory extends FactoryAdaptor {
	@Override
	public PlayerVisitor createSkillVisitor(Player player) {
		return null;
//		String playerType = player.getClass().getSimpleName();
//		switch (playerType) {
//		case "Havoc":
//			return new BreakWallVisitor();
//		case "Jager":
//			return new PlaceTrapVisitor();
//		case "Warden":
//			return new ArrestVisitor();
//		case "Gurad":
//			return new ArrestVisitor();
//		default:
//			return null;
//		}
	}
}
