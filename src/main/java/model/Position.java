package model;

import java.util.ArrayList;

import netBattleException.OutOfBoundsCoordinate;

public class Position implements IPosition {
	private ArrayList<Integer> coordonate = new ArrayList<Integer>();

	public Position() {

	}

	public Position(int x) {
		coordonate.add(x);
	}

	public Position(int x, int y) {
		coordonate.add(x);
		coordonate.add(y);
	}

	public Position(int x, int y, int z) {
		coordonate.add(x);
		coordonate.add(y);
		coordonate.add(z);
	}

	public void addcoordonate(int x) throws OutOfBoundsCoordinate {
		if (this.coordonate.size() > 0)
			throw new OutOfBoundsCoordinate();
		else
			coordonate.add(x);
	}

	public void addcoordonate(int x, int y) throws OutOfBoundsCoordinate {
		if (this.coordonate.size() > 1)
			throw new OutOfBoundsCoordinate();
		else {
			coordonate.add(x);
			coordonate.add(y);
		}
	}

	public void addcoordonate(int x, int y, int z)
			throws OutOfBoundsCoordinate {
		if (this.coordonate.size() > 2)
			throw new OutOfBoundsCoordinate();
		else {
			coordonate.add(x);
			coordonate.add(y);
			coordonate.add(z);
		}
	}

	public ArrayList<Integer> getCoordonate() {
		return coordonate;
	}

	public void setCoordonate(ArrayList<Integer> coordonate) {
		this.coordonate = coordonate;
	}

	public void setCoordonate(int index, int value) {
		this.coordonate.set(index, value);
	}

	public int getCoordonate(int index) {
		return this.coordonate.get(index);
	}

	public ArrayList<Integer> getListCoordonate() {
		return this.coordonate;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj == this)
			return true;
		if (obj instanceof Position) {
			Position p = (Position) obj;
			if (p.coordonate.size() == coordonate.size()) {
				for (int i = 0; i < p.coordonate.size(); i++) {
					if (p.coordonate.get(i) != coordonate.get(i))
						return false;
				}
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String s = "";
		// s = "(";
		for (int val : coordonate)
			s = s + " " + val + " ";
		// s = ")";
		return s;
	}

}
