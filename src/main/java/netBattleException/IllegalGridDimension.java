package netBattleException;

public class IllegalGridDimension extends Exception {
	public IllegalGridDimension(){
	    System.out.println("Le nombre de dimension(s) ne corresponde(nt) pas au type de grille");
	  }
}