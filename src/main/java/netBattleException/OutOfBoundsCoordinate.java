package netBattleException;

public class OutOfBoundsCoordinate extends Exception {
	public OutOfBoundsCoordinate(){
	    System.out.println("Vous ne pouvez plus ajouter de coordonnée(s) a cette position");
	  }
}
