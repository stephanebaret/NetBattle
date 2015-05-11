package netBattleException;


/**
 * <b>Exception génerer lors du changement des positions d'un ennemi</b>
 * <p>
 * <ul>
 * <li>Lors de l'appel de getGuess si la position n'est pas un entier , cette exception est générée.</li>
 * </ul>
 * </b>
 * @see {@link model.Ennemi#setPosition}
 * 
 * @author BARET Stéphane
 *
 */
public class IllegalPositionMatch extends Exception {
	public IllegalPositionMatch(){
	    System.out.println("Le nombre de coordonnée(s) passée(s) ne corresponde(nt) pas a celle définit dans ennemi.");
	  }
}
