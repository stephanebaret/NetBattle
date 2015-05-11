package controller;

/**
 * <b>Enumération des différentes représentations graphique</b>
 * <p>
 * <ul>
 * <li>Les IHM peuvent etre de deux types : Swing, Console.</li>
 * </ul>
 * </p>
 * @author BARET Stéphane
 *
 */

public enum TypeIHM {
	_SWING ("Swing"),
	_CONSOL ("Console");
	
	private String name = "";
	
	TypeIHM(String name){
		this.name = name;
	}
	
	public String toString(){
		return name;
	}
}
