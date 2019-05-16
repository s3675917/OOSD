package model.player;

import model.Position;
import model.spell.PlayerVisitor;

public class Havoc extends Prisoner {

	public Havoc(Position pos, String name) {
		super(pos, name);
		hasSpell1=true;
		hasSpell2=false;
		hasSpell3=false;
		hasSpell4=false;
		
	}

	@Override
	public void accpet(PlayerVisitor v) {
		v.visit(this);
		
	}
	

}
