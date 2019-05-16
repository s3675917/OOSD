package model.tile;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.image.BufferedImage;


import controller.TileManager;
import model.Position;
import model.player.LawEnforcer;
import model.player.PlayerStat;
import model.player.Guard;
import view.utils.Sprite;

public class Trap extends Tiles {
private Sprite sprite;

    public Trap(Position pos, int w, int h) {
        super(null,pos,w,h);
        TileManager.addTile(this);
    }

    /**
     * Trap a Guard
     *
     * @param le a law enforcer
     * @Precondition only a Guard player in noraml status can be trapped
     */
    public void trapPlayer(LawEnforcer le) {
        //precondition
        assertTrue(le.getStatus().equals(PlayerStat.normal));
        assertTrue(le instanceof Guard);

        //trap the player
        le.setStatus(PlayerStat.trapped);

        //postcondition
        assertEquals(PlayerStat.trapped, le.getStatus());

    }



}
