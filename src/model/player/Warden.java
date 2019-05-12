package model.player;

import model.Position;
import model.skills.SkillVisitor;

public class Warden extends LawEnforcer {

	public Warden(Position pos, String name) {
		super(pos, name);
		super.FOV = 3;
		super.status = PlayerStat.invincible;
	}

	@Override
	public void accpet(SkillVisitor v) {
		v.visitPlayer(this);
	}

}
