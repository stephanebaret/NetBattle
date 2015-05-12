package netBattleException;

public class NullPointerPosition extends Exception {
	public NullPointerPosition(){
	    System.out.println("La postion passé pointe sur null ou pointe sur une liste de coordonée(s) qui a au moins une référence null.");
	  }
}
