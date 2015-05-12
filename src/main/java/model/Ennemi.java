package model;

import java.util.ArrayList;

import netBattleException.IllegalPositionMatch;
import netBattleException.IllegalValuePosition;
import netBattleException.NullPointerPosition;

public class Ennemi implements IEnnemi {

	private int longeurEnnemi;
	private ArrayList<IPosition> position;
	private int hit;
	
	public Ennemi() {
		super();
		position = new ArrayList<IPosition>();
		longeurEnnemi = 0;
		hit = 0;
	}
		
	public Ennemi(int longeurEnnemi) {
		super();
		position = new ArrayList<IPosition>();
		this.longeurEnnemi = longeurEnnemi;
		this.hit = 0;
	}
	
	public ArrayList<IPosition> getPosition() {
		return position;
	}

	public int getLongeurEnnemi() {
		return longeurEnnemi;
	}
	
	public void setLongeurEnnemi(int longeurEnnemi) {
		this.longeurEnnemi = longeurEnnemi;
	}

	public int getHit() {
		return hit;
	}
	
	public void setHit(int hit) {
		this.hit = hit;
	}

	public void addPosition(IPosition pos) {
		this.position.add(pos);
	}
	
	public void setPosition(ArrayList<IPosition> pos) throws IllegalPositionMatch, NullPointerPosition, IllegalValuePosition {
		try {
			if (position.size() != pos.size()) throw new IllegalPositionMatch();
			for(IPosition p : pos) {
				if (p == null) throw new NullPointerException();
			}
			for(IPosition p : pos) {
				for(int value : p.getCoordonate())
					if (value < 0) throw new IllegalValuePosition();
			}
			position.clear();
			for (IPosition p : pos)
				position.add(p);
		} catch (NullPointerException e) {
			e.printStackTrace();
			throw new NullPointerPosition();
		}
	}
	
	public Tire checkGuess(IPosition pos) {
		//if ((pos < 0) || (pos > 7)) throw new IndexOutOfBoundsException();
		for(int i = 0;i < position.size();i++) {
			for (IPosition p : position) {
				if (p.equals(pos)) {
					hit++;
					if (hit == longeurEnnemi)
						return Tire.Sink;
					else
						return Tire.Touch;
				}
			}
		}
		return Tire.Miss;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (obj == this) return true;
		if (obj instanceof Ennemi) {
			Ennemi e = (Ennemi) obj;
			if (position.size() == e.getPosition().size()) {
				for (int i = 0;i < position.size();i++) {
					if (position.get(i).getCoordonate().size() != 
							e.getPosition().get(i).getCoordonate().size()) return false; 
				}
				for (int i = 0;i < position.size();i++) {
					for (int j = 0;j < position.get(i).getListCoordonate().size();j++)
						if (position.get(i).getCoordonate(j) 
								!= e.getPosition().get(i).getCoordonate(j)) return false;
				}
				return true;
			}
		}
		return false;
	}
	
	
	
//	private boolean checkGrid(int pos,ArrayList<Integer> grille) {
//		if (grille.size() == 1) {
//			
//		} else if (grille.size() == 2) {
//			
//		} else if (grille.size() > 2) {
//			
//		}
//		return false;
//	}
}
