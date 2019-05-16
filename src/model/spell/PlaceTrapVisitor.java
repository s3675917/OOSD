package model.spell;

import model.player.Jager;
import model.tile.Trap;

public class PlaceTrapVisitor extends VisitorAdapter {
	public PlaceTrapVisitor() {
		requiredStamina = 3;
	}

	@Override
	public void visit(Jager jager) {
		placeTrap(jager);

	}

	private void placeTrap(Jager jager) {
		if (!jager.checkStamina(requiredStamina)) {
			return;
		}

		Trap trap =new Trap(jager.getPos(),16,16);

	}

}
