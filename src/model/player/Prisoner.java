package model.player;

import model.Position;

public abstract class Prisoner extends Player {

	public Prisoner(Position pos, String name) {
		super(pos, name);
	}


	protected boolean checkInventory() {
		boolean x = false;
		if (x) {
			return true;
		}
		return false;
	}


	public void useAbility() {
		// TODO Auto-generated method stub
		
	}
}
