package model;
import java.util.ArrayList;

import org.junit.Test;

import netBattleException.IllegalPositionMatch;
import netBattleException.IllegalValuePosition;
import netBattleException.NullPointerPosition;
import junit.framework.TestCase;


public class EnnemiTest {
	
	@Test (expected = IllegalPositionMatch.class)
	public void testExceptionIsThrown() throws IllegalPositionMatch, NullPointerPosition, IllegalValuePosition {  
		Ennemi e = new Ennemi();
		e.setLongeurEnnemi(1);
		ArrayList<Position> testPos = new ArrayList<Position>();
		testPos.add(new Position(1));
		testPos.add(new Position(2));
		e.setPosition(testPos);
	} 
}