package model.player;

import model.Position;
import model.skills.SkillVisitor;

public class Havoc extends Prisoner {

	public Havoc(Position pos, String name) {
		super(pos, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void useAbility() {
		breakWall();

	}

	private void breakWall() {
		
	}
	

	@Override
	public void accpet(SkillVisitor v) {
		v.visitPlayer(this);
		
	}
	

}
