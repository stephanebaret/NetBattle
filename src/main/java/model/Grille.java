package model;

import netBattleException.IllegalGridDimension;

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
