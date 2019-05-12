package model.player;

import model.Position;
import model.skills.SkillVisitor;

public class Guard extends LawEnforcer {

	public Guard(Position pos, String name) {
		super(pos, name);
		super.FOV=7;
		super.status = PlayerStat.normal;
	}

	@Override
	public void accpet(SkillVisitor v) {
		v.visitPlayer(this);
		
	}

}
