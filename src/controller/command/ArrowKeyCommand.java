package controller.command;

import controller.GameControl;
import model.player.Player;
import model.spell.PlayerVisitor;

public abstract class ArrowKeyCommand implements Command {

	@Override
	public abstract void execute(Player player) ;
	@Override
	public void execute(Player player,PlayerVisitor pv) {return;};
	
	protected void printInfo(Player currentPlayer) {
		int count = GameControl.playerCounter;
		System.out.println(currentPlayer.getClass().getSimpleName() + " ");
		System.out.println(" @ " + currentPlayer.getPos().getSeq());
		System.out.println(currentPlayer.getPos());
		System.out.println();

		if (count < GameControl.players.size() - 1) {
			GameControl.playerCounter++;
		} else {
			GameControl.playerCounter = 0;
		}
	}

}
