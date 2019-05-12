package model.player;

import model.Position;
import model.skills.SkillVisitor;

public class A47 extends Prisoner {

	public A47(Position pos, String name) {
		super(pos, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void useAbility() {
		disguise();

	}

	private void disguise() {
	
		
	}

	@Override
	public void accpet(SkillVisitor sVisitor) {
		// TODO Auto-generated method stub
		
	}

}
