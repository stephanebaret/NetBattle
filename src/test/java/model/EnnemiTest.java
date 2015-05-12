package model;
import java.util.ArrayList;

import netBattleException.IllegalPositionMatch;
import netBattleException.IllegalValuePosition;
import netBattleException.NullPointerPosition;

import org.easymock.EasyMock;
import org.junit.Test;

import static org.easymock.EasyMock.createNiceMock;

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
	
	@Test
	public void testCheckGuess() {
		IPosition getCoordonnMethod = createNiceMock(IPosition.class);
		ArrayList<Integer> pos = new ArrayList();
		pos.add(1);
		EasyMock.expect(getCoordonnMethod.getListCoordonnée()).andReturn(pos);
		Ennemi e = new Ennemi();
		e.setLongeurEnnemi(1);
		e.addPosition(getCoordonnMethod);
		e.checkGuess(getCoordonnMethod.getListCoordonnée());
	}

}