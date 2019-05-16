package model.spell;

import controller.GameControl;
import model.Position;
import model.player.Guard;
import model.player.LawEnforcer;
import model.player.Player;
import model.player.PlayerStat;
import model.player.Warden;

public class ArrestVisitor extends VisitorAdapter {
	public ArrestVisitor() {
		spellRange=1;
	}
	@Override
	public void visit(Warden warden) {
		arrest(warden);
	}

	@Override
	public void visit(Guard guard) {
		arrest(guard);
	}

	public void arrest(LawEnforcer player) {
		if (!player.checkStamina(requiredStamina)) {
			return;
		}

		Position targetPosition= player.getNextXPosition(spellRange);

		boolean done=false;
		for (int i = 0; i < GameControl.players.size(); i++) {
			Player targetPlayer = GameControl.players.get(i);
			if (targetPosition.equals(targetPlayer.getPos())) {
				targetPlayer.setStatus(PlayerStat.arrested);
				System.out.println(player.getName() + " arrested " + targetPlayer.getName());
				done=true;
			}
		}
		if (!done) {
			System.out.println("no player within range;");
		}
	}

}
