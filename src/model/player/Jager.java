package model.player;

import model.Position;
import model.skills.SkillVisitor;

public class Jager extends Prisoner {

	public Jager(Position pos, String name) {
		super(pos, name);
		// TODO Auto-generated constructor stub
		super.offX=4;
		super.offY=3;
		System.out.println(super.offX+" "+super.offY);
	}

	@Override
	public void useAbility() {
		placeTrap();

	}

	private void placeTrap() {
		
		
	}

	@Override
	public void accpet(SkillVisitor v) {
		v.visitPlayer(this);
		
	}

}
