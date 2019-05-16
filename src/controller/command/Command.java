package controller.command;

import model.player.Player;
import model.spell.PlayerVisitor;

public interface Command {
	void execute(Player player) ;

	void execute(Player player, PlayerVisitor pv);
}
