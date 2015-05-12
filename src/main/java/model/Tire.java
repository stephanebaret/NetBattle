package model;


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
