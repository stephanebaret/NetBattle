package model;

/**
 * <b>Enumération </b>
 * <p>
 * <ul>
 * <li>Les dimensions peuvent etre de deux types : _1D, _2D, _3D.</li>
 * </ul>
 * </p>
 * @author BARET Stéphane
 *
 */

public enum TypeGrille {
	_1D ("1D"),
	_2D ("2D"),
	_3D ("3D");
	
	private String name = "";
	
	TypeGrille(String name){
		this.name = name;
	}
	
	public String toString(){
		return name;
	}
}
