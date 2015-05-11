package netBattleException;

/**
 * <b>Exception génerer lors du changement d"une positions d'un ennemi</b>
 * <p>
 * <ul>
 * <li>Lors de l'appel du setter si une nombre positions est inferieur à 0, cette exception est générée.</li>
 * </ul>
 * </b>
 * @see {@link model.Ennemi#setPosition}
 * 
 * @author BARET Stéphane
 *
 */

public class IllegalValuePosition extends Exception {
	public IllegalValuePosition(){
	    System.out.println("Une des postions passées a une valeur < 0.");
	  }
}
