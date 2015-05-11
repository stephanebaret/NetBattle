package model;

import netBattleException.IllegalGridDimension;

public class GrilleTestDrive {

	public static void main(String[] args) {
		Grille g;
		
		try {
			g = new Grille(TypeGrille._1D,10);
			System.out.println("ok");
		} catch (IllegalGridDimension e) {
			System.out.println("nok");
			//e.printStackTrace();
		}
		
		g = null;
		
		try {
			g = new Grille(TypeGrille._2D,10);
			System.out.println("nok");
		} catch (IllegalGridDimension e) {
			System.out.println("ok");
			//e.printStackTrace();
		}
		
		g = null;
		
		try {
			g = new Grille(TypeGrille._2D,10,10);
			System.out.println("ok");
		} catch (IllegalGridDimension e) {
			System.out.println("nok");
			//e.printStackTrace();
		}
		
		g = null;
		
		try {
			g = new Grille(TypeGrille._2D,10,10,10);
			System.out.println("nok");
		} catch (IllegalGridDimension e) {
			System.out.println("ok");
			//e.printStackTrace();
		}
		
		g = null;
		
		try {
			g = new Grille(TypeGrille._3D,10,10,10);
			System.out.println("ok");
		} catch (IllegalGridDimension e) {
			System.out.println("nok");
			//e.printStackTrace();
		}
	}

}
