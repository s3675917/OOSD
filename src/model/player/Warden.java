package model.player;

import model.Position;
import model.spell.PlayerVisitor;

public class Warden extends LawEnforcer {

	public Warden(Position pos, String name) {
		super(pos, name);
		super.FOV = 3;
		super.status = PlayerStat.invincible;
	}

	@Override
	public void accpet(PlayerVisitor v) {
		v.visit(this);
	}

}
