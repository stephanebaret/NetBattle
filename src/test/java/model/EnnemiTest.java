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
		
		IPosition getCoordonnMethod1 = createNiceMock(IPosition.class);
		ArrayList<Integer> pos1 = new ArrayList<Integer>();
		pos1.add(1);
		EasyMock.expect(getCoordonnMethod1.getListCoordonate()).andReturn(pos1);
		
		IPosition getCoordonnMethod2 = createNiceMock(IPosition.class);
		ArrayList<Integer> pos2 = new ArrayList<Integer>();
		pos2.add(2);
		EasyMock.expect(getCoordonnMethod2.getListCoordonate()).andReturn(pos2);
		
		e.setLongeurEnnemi(1);
		ArrayList<IPosition> testPos = new ArrayList<IPosition>();
		testPos.add(getCoordonnMethod1);
		testPos.add(getCoordonnMethod2);
		e.setPosition(testPos);
	}
	
	@Test
	public void testCheckGuess() {
		IPosition getCoordonnMethod = createNiceMock(IPosition.class);
		ArrayList<Integer> pos = new ArrayList<Integer>();
		pos.add(1);
		EasyMock.expect(getCoordonnMethod.getListCoordonate()).andReturn(pos);
		Ennemi e = new Ennemi();
		e.setLongeurEnnemi(1);
		e.addPosition(getCoordonnMethod);
		e.checkGuess(getCoordonnMethod);
	}

}