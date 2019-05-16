package controller.command;

import model.player.Player;
import model.spell.PlayerVisitor;

public abstract class SpellCommand implements Command {

	@Override
	public abstract void execute(Player player,PlayerVisitor pv);
	@Override
	public void execute(Player player) {return;}
	

}
