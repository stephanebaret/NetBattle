package model;

import netBattleException.IllegalGridDimension;
import netBattleException.OutOfBoundsCoordinate;

public class PositionTestDrive {

	public static void main(String[] args) throws IllegalGridDimension, OutOfBoundsCoordinate {
		Jeux j = new Jeux();
		j.setPlateau(new Grille(TypeGrille._1D,7));
		Position pTest = new Position();
		
		try {
			pTest.addcoordonate(0);
			pTest.addcoordonate(1);
			System.out.println("nok");
		} catch (OutOfBoundsCoordinate e) {
			System.out.println("ok");
			//e.printStackTrace();
		}
		
		pTest.getCoordonate().clear();
		
		j.setPlateau(new Grille(TypeGrille._2D,10,10));
		try {
			pTest.addcoordonate(0,2);
			pTest.addcoordonate(1);
			System.out.println("nok");
		} catch (OutOfBoundsCoordinate e) {
			System.out.println("ok");
			//e.printStackTrace();
		}
		
		pTest.getCoordonate().clear();
		
		j.setPlateau(new Grille(TypeGrille._3D,10,10,10));
		try {
			pTest.addcoordonate(0,1,2);
			pTest.addcoordonate(1);
			System.out.println("nok");
		} catch (OutOfBoundsCoordinate e) {
			System.out.println("ok");
			//e.printStackTrace();
		}
		
		Position pTest2 = new Position();
		pTest2.addcoordonate(1);
		
		pTest = null;
		if (!pTest2.equals(pTest)) System.out.println("ok");
		else
			System.out.println("nok");
		pTest = pTest2;
		if (pTest2.equals(pTest)) System.out.println("ok");
		else
			System.out.println("nok");
		pTest = new Position(1);
		if (pTest2.equals(pTest)) System.out.println("ok");
		else
			System.out.println("nok");
		
		pTest.getCoordonate().clear();
		pTest2.getCoordonate().clear();
		pTest.addcoordonate(0, 2);
		pTest2.addcoordonate(0, 2);
		if (pTest2.equals(pTest)) System.out.println("ok");
		else
			System.out.println("nok");
		
		pTest.getCoordonate().clear();
		pTest2.getCoordonate().clear();
		pTest.addcoordonate(0, 2, 4);
		pTest2.addcoordonate(0, 2, 4);
		if (pTest2.equals(pTest)) System.out.println("ok");
		else
			System.out.println("nok");
		
		pTest.getCoordonate().clear();
		pTest2.getCoordonate().clear();
		pTest.addcoordonate(0, 2);
		pTest2.addcoordonate(0, 2, 4);
		if (!pTest2.equals(pTest)) System.out.println("ok");
		else
			System.out.println("nok");
	}

}
