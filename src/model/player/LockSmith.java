package model.player;

import model.Position;
import model.spell.PlayerVisitor;

public class LockSmith extends Prisoner {

	public LockSmith(Position pos, String name) {
		super(pos, name);
		hasSpell1=false;
		hasSpell2=false;
		hasSpell3=true;
		hasSpell4=false;
	}

	

	@Override
	public void accpet(PlayerVisitor sVisitor) {
		// TODO Auto-generated method stub
		
	}

}
