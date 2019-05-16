package controller.command;

import model.DIR;
import model.player.Player;

public class RightKeyCommand extends ArrowKeyCommand {

	@Override
	public void execute(Player currentPlayer) {
		try {
			currentPlayer.move(DIR.right);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return;
		}
		printInfo(currentPlayer);

	}

}
