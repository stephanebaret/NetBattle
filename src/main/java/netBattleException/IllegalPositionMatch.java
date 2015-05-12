package netBattleException;


public class IllegalPositionMatch extends Exception {
	public IllegalPositionMatch(){
	    System.out.println("Le nombre de coordonnée(s) passée(s) ne corresponde(nt) pas a celle définit dans ennemi.");
	  }
}
