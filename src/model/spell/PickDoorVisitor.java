package model.spell;

import model.player.LockSmith;

public class PickDoorVisitor extends VisitorAdapter {

	@Override
	public void visit(LockSmith locksmith) {
		pickLock(locksmith);

	}

	private void pickLock(LockSmith locksmith) {
		
		if (!locksmith.checkStamina(requiredStamina)) {
			return;
		}

		boolean done = false;

		if (!done) {
			System.out.println("no locked door ahead");
		}

	}

}
