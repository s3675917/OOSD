package model.spell;

import model.player.A47;
import model.player.Havoc;
import model.player.Jager;
import model.player.LockSmith;

public abstract class BreakWallBehaviour extends BreakWallVisitor{
	public abstract void visit(Havoc havoc);

	public abstract void visit(Jager jager);

	public abstract void visit(A47 a47);

	public abstract void visit(LockSmith locksmith);
}

