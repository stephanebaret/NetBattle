package model;

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
