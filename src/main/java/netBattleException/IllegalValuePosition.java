package netBattleException;

public class IllegalValuePosition extends Exception {
	public IllegalValuePosition(){
	    System.out.println("Une des postions passées a une valeur < 0.");
	  }
}
