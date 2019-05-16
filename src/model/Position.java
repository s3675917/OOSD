package model;

import controller.GameControl;

public class Position {
	private int x;
	private int y;

	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean equals(Position pos) {
		if (this.getX()==pos.getX()&&this.getY()==pos.getY()) {
			return true;
		}else {
			return false;
		}

	}

	@Override
	public String toString() {
		return "x: " + x + " y: " + y;
	}

	/**
	 * @return sequence of the position in game board
	 */
	public int getSeq() {

		int gz = GameControl.gameSize;

		int seq = gz * y + x;

		return seq;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
