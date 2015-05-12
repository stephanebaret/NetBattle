package model;

import java.util.ArrayList;

import netBattleException.IllegalPositionMatch;
import netBattleException.IllegalValuePosition;
import netBattleException.NullPointerPosition;

public interface IEnnemi {
	public void addPosition(IPosition pos);
	
	public void setPosition(ArrayList<IPosition> pos) throws IllegalPositionMatch, NullPointerPosition, IllegalValuePosition;
	
	public Tire checkGuess(IPosition pos);
	
}
