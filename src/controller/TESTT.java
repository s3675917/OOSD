package controller;

import org.junit.Before;
import org.junit.Test;

import model.Position;

public class TESTT {
	Position pos;

	@Before
	public void setup() {
		pos=new Position(2, 2);

	}
	
	@Test
	public void test() {
		GameControl gc = new GameControl();
		gc.run();
		
	}

}
