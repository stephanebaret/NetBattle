package model;

import java.util.ArrayList;

import netBattleException.OutOfBoundsCoordinate;

/**
 * <b>Classe définissant les coordonate d'une Position</b>
 * <p>
 * <ul>
 * <li>private ArrayList<Integer> coordonnée : coordonate de la position</li>
 * </ul>
 * </p>
 * 
 * @author BARET Stéphane
 */

public class Position {
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

	/**
	 * <b>Méthode pour modifier les coordonate d'une Position</b>
	 * <p>
	 * <ul>
	 * <li>Elle reçoit une coordonnée x.</li>
	 * </ul>
	 * </p>
	 * 
	 * @param x
	 *            : coordonnée x de Position
	 * @throws OutOfBoundsCoordinate
	 *             : génère cette exception si trop de dimension sont saisies
	 */
	public void addcoordonate(int x) throws OutOfBoundsCoordinate {
		if (this.coordonate.size() > 0)
			throw new OutOfBoundsCoordinate();
		else
			coordonate.add(x);
	}

	/**
	 * <b>Méthode pour modifier les coordonate d'une Position</b>
	 * <p>
	 * <ul>
	 * <li>Elle reçoit des coordonnée x et y.</li>
	 * </ul>
	 * </p>
	 * 
	 * @param x
	 *            : coordonnée x de Position
	 * @param y
	 *            : coordonnée y de Position
	 * @throws OutOfBoundsCoordinate
	 *             : génère cette exception si trop de dimension sont saisies
	 */
	public void addcoordonate(int x, int y) throws OutOfBoundsCoordinate {
		if (this.coordonate.size() > 1)
			throw new OutOfBoundsCoordinate();
		else {
			coordonate.add(x);
			coordonate.add(y);
		}
	}

	/**
	 * <b>Méthode pour modifier les coordonate d'une Position</b>
	 * <p>
	 * <ul>
	 * <li>Elle reçoit une coordonnée x,y et z.</li>
	 * </ul>
	 * </p>
	 * 
	 * @param x
	 *            : coordonnée x de Position
	 * @param y
	 *            : coordonnée y de Position
	 * @param z
	 *            : coordonnée z de Position
	 * @throws OutOfBoundsCoordinate
	 *             : génère cette exception si trop de dimension sont saisies
	 */
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

	public ArrayList<Integer> getCoordonnée() {
		return coordonate;
	}

	public void setCoordonnée(ArrayList<Integer> coordonate) {
		this.coordonate = coordonate;
	}

	public void setCoordonnée(int index, int value) {
		this.coordonate.set(index, value);
	}

	public int getCoordonnée(int index) {
		return this.coordonate.get(index);
	}

	public ArrayList<Integer> getListCoordonnée() {
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
