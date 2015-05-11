package netBattleException;

/**
 * <b>Exception génerer lors de la saisie d'un caratères interdit</b>
 * <p>
 * <ul>
 * <li>Lors de l'appel , cette exception est générée.</li>
 * </ul>
 * </b>
 * @see {@link console.Main#getGuess}
 * 
 * @author BARET Stéphane
 *
 */
public class IllegalCaracterException extends Exception {
	public IllegalCaracterException(){
	    System.out.println("Vous devenez uniquement saisir des nombres!");
	  }
}

