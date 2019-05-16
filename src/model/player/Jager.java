package model.player;

import model.Position;
import model.spell.PlayerVisitor;

public class Jager extends Prisoner {

	public Jager(Position pos, String name) {
		super(pos, name);
		// TODO Auto-generated constructor stub
//		super.offX=4;
//		super.offY=3;
//		System.out.println(super.offX+" "+super.offY);
		hasSpell1=false;
		hasSpell2=true;
		hasSpell3=false;
		hasSpell4=false;
	}


	private void placeTrap() {
		
		
	}

	@Override
	public void accpet(PlayerVisitor v) {
		v.visit(this);
		
	}

}
