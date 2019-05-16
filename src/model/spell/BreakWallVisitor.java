package model.spell;

import controller.TileManager;
import model.Position;
import model.player.A47;
import model.player.Havoc;
import model.player.Jager;
import model.player.LockSmith;
import model.player.Player;

public class BreakWallVisitor extends VisitorAdapter {
    final boolean havocCan = true;
    boolean jagerCan;
    boolean a47Can;
    boolean locksmithCan;

    public BreakWallVisitor() {
        spellRange = 1;
        spellNo = 1;
    }

    public BreakWallVisitor(boolean a, boolean b, boolean c, boolean d) {
        spellRange = 1;
        spellNo = 1;
        jagerCan = b;
        a47Can = c;
        locksmithCan = d;
    }

    @Override
    public void visit(Havoc havoc) {
        breakWall(havoc);
    }

    @Override
    public void visit(Jager jager) {
        if (jagerCan) {
            breakWall(jager);
        }
    }

    @Override
    public void visit(A47 a47) {
        if (a47Can) {
            breakWall(a47);
        }
    }

    @Override
    public void visit(LockSmith locksmith) {
        if (locksmithCan) {
            breakWall(locksmith);
        }
    }


    private void breakWall(Player player) {
        if (!player.checkStamina(requiredStamina)) {
            return;
        }
        int targetSeq = 0;
        Position targetPosition = player.getNextXPosition(spellRange);
        targetSeq = targetPosition.getSeq();

        if (TileManager.breakWall(targetSeq)) {
            System.out.println("break wall: " + targetSeq);
            player.deductStamina(requiredStamina);
        } else
            System.out.println("no wall ahead");
    }

}
