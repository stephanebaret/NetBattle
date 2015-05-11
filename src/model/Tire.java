/**
 * 
 */
package model;

/**
 * <b>Enumération du résultats d'un tir sr un ennemi</b>
 * <p>
 * <ul>
 * <li>Le résultats peu être de trois type : coulé,touché,raté.</li>
 * </ul>
 * </p>
 * @author BARET Stéphane
 *
 */
public enum Tire {
	Sink ("Coulé!"),
	Touch ("Touché"),
	Miss ("Raté!");
	
	private String name = "";
	
	Tire(String name){
		this.name = name;
	}
	
	public String toString(){
		return name;
	}
}
