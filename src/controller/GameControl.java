package controller;

import model.DIR;
import model.Position;
import model.player.Havoc;

public class GameControl {
	public static int wall[] = { 1, 2, 3, 4, 5, 6 };
	public static int gameSize = 6;

	public GameControl() {
	}

	public void run() {
		Havoc p = new Havoc(new Position(2, 1), "aaa");
		try {
			p.move(DIR.left);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println(p.getPos().getSeq());
		System.out.println(p.getPos());
	}
}
