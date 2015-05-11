package netBattleException;

/**
 * <b>Exception génerer lors du changement des positions d'un ennemi sur une référence null</b>
 * <p>
 * <ul>
 * <li>Lors de l'appel du setter si le nombre positions pointent sur une liste de référence null, cette exception est générée.</li>
 * </ul>
 * </b>
 * @see {@link model.Ennemi#setPosition}
 * 
 * @author BARET Stéphane
 *
 */

public class NullPointerPosition extends Exception {
	public NullPointerPosition(){
	    System.out.println("La postion passé pointe sur null ou pointe sur une liste de coordonée(s) qui a au moins une référence null.");
	  }
}
