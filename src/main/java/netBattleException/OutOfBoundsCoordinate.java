package netBattleException;

/**
 * <b>Exception génerer lors de la saisie d'une dimension superieur a celle de La grille du jeux</b>
 * <p>
 * <ul>
 * <li>Lors de l'appel , cette exception est générée.</li>
 * </ul>
 * </b>
 * @see {@link Grille},{@link Jeux}
 * 
 * @author BARET Stéphane
 *
 */
public class OutOfBoundsCoordinate extends Exception {
	public OutOfBoundsCoordinate(){
	    System.out.println("Vous ne pouvez plus ajouter de coordonnée(s) a cette position");
	  }
}
