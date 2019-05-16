package model.spell;

import model.player.LockSmith;
import model.player.PlayerStat;

public class DisguseVisitor extends VisitorAdapter {
	@Override
	public void visit(LockSmith player) {
		disguse(player);
	}

	public void disguse(LockSmith player) {
		if (!player.checkStamina(requiredStamina)) {
			return;
		}
		
		
		
		
		
		
		boolean done = false;
		if (player.getStatus()!=PlayerStat.arrested||player.getStatus()!=PlayerStat.disgused) {

			player.setStatus(PlayerStat.disgused);
			done=true;
		}
		
		if (!done) {
			System.out.println("no wall ahead");
		}
		
	}

}
