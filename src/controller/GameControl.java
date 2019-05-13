package controller;

import java.util.ArrayList;
import model.DIR;
import model.Position;
import model.player.Havoc;
import model.player.Jager;
import model.player.Player;
import model.player.Warden;
import model.skills.ArrestVisitor;
import model.skills.BreakWallVisitor;
import model.skills.PlaceTrapVisitor;
import model.skills.SkillVisitor;
import utility.XMLreader;
import view.tilesMap.TileMap;

public class GameControl {
	public static int wall[]; //= { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 21, 31, 41, 51, 61, 71, 81, 91, 10, 20, 30, 40, 50,
			//60, 70, 80, 90, 100, 92, 93, 94, 95, 96, 97, 98, 99 };
	public static int gameSize = 40;
	public static DIR dir;
	public static int playerCounter=0;
	public static ArrayList<Player> players;
	public static ArrayList<SkillVisitor> skills;
	private static ArrayList<TileMap> tileMaps;


	public GameControl() {
		initilize();
	}

	public static void initilize() {
		try {
			XMLreader.iniWall();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("read error");
		}
		players = new ArrayList<Player>();
		skills = new ArrayList<SkillVisitor>();

		Havoc h = new Havoc(new Position(7, 5), "aaa");
		SkillVisitor hsv = new BreakWallVisitor();
		Jager j = new Jager(new Position(12, 5), "bbb");
		SkillVisitor jsv = new PlaceTrapVisitor();
		//A47 a = new A47(util.randPos(), "ccc");
		//LockSmith l = new LockSmith(util.randPos(), "ddd");

		Warden w = new Warden(new Position(13, 6), "eee");
		SkillVisitor wsv = new ArrestVisitor();
		//Guard g = new Guard(util.randPos(), "fff");

		players.add(h);
		skills.add(hsv);
		players.add(j);
		skills.add(jsv);
//		players.add(a);
//		players.add(l);
//		players.add(w);
		players.add(w);
		skills.add(wsv);


		playerCounter = 0;

	}

	public static ArrayList<TileMap> getTileMaps() {
		return tileMaps;
	}

	public static void setTileMaps(ArrayList<TileMap> TileMaps) {
		tileMaps = TileMaps;
	}

//	private static int[] iniWall() {
//		List<Integer> list = new ArrayList<Integer>();// **椤诲畾涔夋椂灏辫繘琛岃浆鍖�**
//		for (int i = 0; i < gameSize; i++) {
//			list.add(i+1);
//			list.add(i*gameSize+1);
//			list.add((i+1)*gameSize);
//			if (i == gameSize-1) {
//				for (int j = 0; j < gameSize-1; j++) {
//					list.add(j+1+gameSize*(gameSize-1));
//				}
//			}
//		}
//		Integer[] nsz = new Integer[list.size()];
//		list.toArray(nsz);
//		wall = list.stream().mapToInt(Integer::intValue).toArray();
//		return wall;
//
//	}


}
