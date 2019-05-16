package model.player;

import model.Position;
import model.spell.PlayerVisitor;

public class A47 extends Prisoner {

	public A47(Position pos, String name) {
		super(pos, name);
		hasSpell1=false;
		hasSpell2=false;
		hasSpell3=false;
		hasSpell4=true;
	}

	@Override
	public void accpet(PlayerVisitor sVisitor) {
		// TODO Auto-generated method stub
		
	}

}
