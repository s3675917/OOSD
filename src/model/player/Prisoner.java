package model.player;

import model.Position;

public abstract class Prisoner extends Player {
	protected boolean hasSpell1;
	protected boolean hasSpell2;
	protected boolean hasSpell3;
	protected boolean hasSpell4;

	public Prisoner(Position pos, String name) {
		super(pos, name);
	}

	public void enableSpell(int spellNo) {
		switch (spellNo) {
		case 1:
			hasSpell1 = true;
			break;
		case 2:
			hasSpell1 = true;
			break;
		case 3:
			hasSpell1 = true;
			break;
		case 4:
			hasSpell1 = true;
			break;

		default:
			break;
		}
	}

	public boolean hasSpellX(int X) {
		switch (X) {
		case 1:

			return hasSpell1;
		case 2:

			return hasSpell2;
		case 3:

			return hasSpell3;
		case 4:

			return hasSpell4;

		default:
			return false;
		}
	}

	protected boolean checkInventory() {
		boolean x = false;
		if (x) {
			return true;
		}
		return false;
	}

}
