package controller.command;

import model.player.Player;
import model.spell.PlayerVisitor;

public class RKeyCommand extends SpellCommand {

	@Override
	public void execute(Player currentPlayer,PlayerVisitor pv) {
			currentPlayer.accpet(pv);

	}

}
