package model;
import java.util.ArrayList;

import org.junit.Test;

import netBattleException.IllegalPositionMatch;
import netBattleException.IllegalValuePosition;
import netBattleException.NullPointerPosition;
import junit.framework.TestCase;


public class EnnemiTest {
	Ennemi e = new Ennemi();
	
	@Test (expected = NullPointerPosition.class)
	public void NullPointerException() throws IllegalPositionMatch, NullPointerPosition, IllegalValuePosition {  
		ArrayList<Position> testPos = null;
		e.setPosition(testPos);
	} 
}