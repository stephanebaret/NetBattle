package model;

import netBattleException.IllegalGridDimension;

/**
 * <b>Grille - définit un plateau de jeux en 1 ou 2 dimensions.</b>
 * <p>
 * <ul>
 * <li>tGrille : définit le type de grille en 1 ou 2 dimensions</li>
 * <li>longueurX : longueur de l'axe des x </li>
 * <li>longueurY : longueur de l'axe des y (mis a -1 si la grille est en 1 dimmension)</li>
 * <li>longueurZ : longueur de l'axe des z (mis a -1 si la grille est en 2 dimmension)</li>
 * </ul>
 * </p>
 * @author BARET Stéphane
 *
 */

public class Grille {
	private TypeGrille tGrille;
	private int longueurX;
	private int longueurY;
	private int longueurZ;
	
	public Grille() {
		
	}
	
	public Grille(TypeGrille tG,int lX) throws IllegalGridDimension {
		if (tG.equals(TypeGrille._1D)) {
			longueurX = lX;
			longueurY = -1;
			longueurZ = -1;
			tGrille = tG;
		}
		else throw new IllegalGridDimension();	
	}
	
	public Grille(TypeGrille tG,int lX,int lY) throws IllegalGridDimension {
		if (tG.equals(TypeGrille._2D)) {
			longueurX = lX;
			longueurY = lY;
			longueurZ = -1;
			tGrille = tG;
		}
		else throw new IllegalGridDimension();	
	}

	public Grille(TypeGrille tG,int lX,int lY,int lZ) throws IllegalGridDimension {
		if (tG.equals(TypeGrille._3D)) {
			longueurX = lX;
			longueurY = lY;
			longueurZ = lZ;
			tGrille = tG;
		}
		else throw new IllegalGridDimension();	
	}
	
	public TypeGrille gettGrille() {
		return tGrille;
	}

	public void settGrille(TypeGrille tGrille) {
		this.tGrille = tGrille;
	}

	public int getLongueurX() {
		return longueurX;
	}

	public int getLongueurY() {
		return longueurY;
	}

	public int getLongueurZ() {
		return longueurZ;
	}

	public void setLongueurX(int longueurX) {
		this.longueurX = longueurX;
	}

	public void setLongueurY(int longueurY) {
		this.longueurY = longueurY;
	}
	
	public void setLongueurZ(int longueurZ) {
		this.longueurZ = longueurZ;
	}
	
}
