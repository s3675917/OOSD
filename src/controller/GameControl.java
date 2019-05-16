package controller;

import java.util.ArrayList;
import model.Position;
import model.player.Havoc;
import model.player.Jager;
import model.player.Player;
import model.player.Warden;


public class GameControl {
	public static int gameSize = 40;
	public static int playerCounter = 0;
	public GameControl instance = null;
	public static ArrayList<Player> players;

	public GameControl() {
		initilize();
	}

	public  GameControl getInstance() {
		if (instance == null) {
			synchronized (GameControl.class) {
				if (instance == null) {
					GameControl gc = new GameControl();
					instance = gc;
				}
			}
		}
		return instance;
	}

	public static void initilize() {
		players = new ArrayList<Player>();

		Havoc h = new Havoc(new Position(7, 5), "Test Havoc");
		Jager j = new Jager(new Position(12, 5), "Test Jager");
		// A47 a = new A47(util.randPos(), "ccc");
		// LockSmith l = new LockSmith(util.randPos(), "ddd");

		Warden w = new Warden(new Position(13, 6), "Test Warden");
		// Guard g = new Guard(util.randPos(), "fff");

		players.add(h);
		players.add(j);
//		players.add(a);
//		players.add(l);
//		players.add(w);
		players.add(w);

		playerCounter = 0;

	}





}
