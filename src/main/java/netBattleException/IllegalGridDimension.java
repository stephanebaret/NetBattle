package netBattleException;

/**
 * <b>Exception génerer lors de la création d'une grille</b>
 * <p>
 * <ul>
 * <li>Si la dimension est différente de 1D ou 2D, cette exception est générée.</li>
 * </ul>
 * </b>
 * @see {@link model.Grille}
 * 
 * @author BARET Stéphane
 *
 */
public class IllegalGridDimension extends Exception {
	public IllegalGridDimension(){
	    System.out.println("Le nombre de dimension(s) ne corresponde(nt) pas au type de grille");
	  }
}