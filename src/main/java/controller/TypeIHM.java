package controller;

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
