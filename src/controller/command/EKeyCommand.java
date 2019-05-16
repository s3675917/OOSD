package controller.command;

import model.player.Player;
import model.spell.PickDoorVisitor;
import model.spell.PlayerVisitor;

public class EKeyCommand extends SpellCommand {

	@Override
	public void execute(Player currentPlayer,PlayerVisitor pv ) {

			
			currentPlayer.accpet(pv);

	}

}
