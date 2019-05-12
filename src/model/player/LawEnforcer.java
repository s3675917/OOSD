package model.player;

import model.Position;

public abstract class LawEnforcer extends Player {

	public LawEnforcer(Position pos, String name) {
		super(pos, name);
		
	}
	

	public void arrest(Prisoner player) {
		// do something
	}
}
