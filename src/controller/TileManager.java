package controller;

import model.Position;
import model.tile.Trap;
import view.tilesMap.TileMap;

import java.util.ArrayList;

public class TileManager {
    private static ArrayList<TileMap> tileMaps;
    private static final int groundLayer = 0;
    private static final int mapLayer = 1;
    private static final int tileLayer = 2;


    public TileManager() {
    }

    public static boolean breakWall(int target) {
        if (tileMaps.get(mapLayer).breakWall(target)) return true; else return false;

    }

    public static ArrayList<TileMap> getTileMaps() {
        return tileMaps;
    }

    public static void setTileMaps(ArrayList<TileMap> tileMap) {
        tileMaps = tileMap;
    }

    public static boolean wallAhead(Position nextPos) {
        int posSeq = nextPos.getSeq();
        if ((tileMaps.get(mapLayer).wallAhead(posSeq))) return true; else return false;
    }


    public static void addTile(Trap trap) {
        tileMaps.get(tileLayer).addTile(trap);
    }
}
