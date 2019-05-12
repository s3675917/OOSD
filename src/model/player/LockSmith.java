package model.player;

import model.Position;
import model.skills.SkillVisitor;

public class LockSmith extends Prisoner {

	public LockSmith(Position pos, String name) {
		super(pos, name);
	}

	@Override
	public void useAbility() {
		pickLock();
		
	}
	
	private void pickLock() {
		
	}

	@Override
	public void accpet(SkillVisitor sVisitor) {
		// TODO Auto-generated method stub
		
	}

}
