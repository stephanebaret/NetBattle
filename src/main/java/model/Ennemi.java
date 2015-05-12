package model;

import java.util.ArrayList;

import netBattleException.IllegalPositionMatch;
import netBattleException.IllegalValuePosition;
import netBattleException.NullPointerPosition;

/**
 * <b>Classe définissant la position et le type d'ennemis</b>
 * <p>
 * <ul>
 * <li>int LONGUEUR_ENEMY : longueur de l'ennemi, constante</li>
 * <li>Position position : liste des positions d'un ennemi</li>
 * <li>int hit : compteur d'une nombre de fois qu'un ennemi est touché</li>
 * </ul>
 * </p>
 * @author BARET Stéphane
 */
public class Ennemi {

	private int longeurEnnemi;
	private ArrayList<Position> position;
	private int hit;
	
	public Ennemi() {
		super();
		position = new ArrayList<Position>();
		longeurEnnemi = 0;
		hit = 0;
	}
		
	public Ennemi(int longeurEnnemi) {
		super();
		position = new ArrayList<Position>();
		this.longeurEnnemi = longeurEnnemi;
		this.hit = 0;
	}
	
	public ArrayList<Position> getPosition() {
		return position;
	}

	public int getLongeurEnnemi() {
		return longeurEnnemi;
	}
	
	public void setLongeurEnnemi(int longeurEnnemi) {
		this.longeurEnnemi = longeurEnnemi;
	}

	public int getHit() {
		return hit;
	}
	
	public void setHit(int hit) {
		this.hit = hit;
	}

	public void addPosition(Position pos) {
		this.position.add(pos);
	}
	
	/**
	 * <b>Méthode pour modifier les positions d'un ennemi</b>
	 * <p>
	 * <ul>
	 * <li>Elle reçoit une liste de position entier en paramètre et remplace celle existantes.</li>
	 * </ul>
	 * </p>
	 */
	public void setPosition(ArrayList<Position> pos) throws IllegalPositionMatch, NullPointerPosition, IllegalValuePosition {
		try {
			if (position.size() != pos.size()) throw new IllegalPositionMatch();
			for(Position p : pos) {
				if (p == null) throw new NullPointerException();
			}
			for(Position p : pos) {
				for(int value : p.getCoordonnée())
					if (value < 0) throw new IllegalValuePosition();
			}
			position.clear();
			for (Position p : pos)
				position.add(p);
		} catch (NullPointerException e) {
			e.printStackTrace();
			throw new NullPointerPosition();
		}
	}
	
	/**
	 * <b>Méthode qui vérifie si la position passer en parametre touche un ennemi</b>
	 * <p>
	 * <ul>
	 * <li>Test la position ou le joueur vise et renvoie le résultat</li>
	 * </ul>
	 * </p>
	 */
	public Tire checkGuess(Position pos) {
		//if ((pos < 0) || (pos > 7)) throw new IndexOutOfBoundsException();
		for(int i = 0;i < position.size();i++) {
			for (Position p : position) {
				if (p.equals(pos)) {
					hit++;
					if (hit == longeurEnnemi)
						return Tire.Sink;
					else
						return Tire.Touch;
				}
			}
		}
		return Tire.Miss;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (obj == this) return true;
		if (obj instanceof Ennemi) {
			Ennemi e = (Ennemi) obj;
			if (position.size() == e.getPosition().size()) {
				for (int i = 0;i < position.size();i++) {
					if (position.get(i).getCoordonnée().size() != 
							e.getPosition().get(i).getCoordonnée().size()) return false; 
				}
				for (int i = 0;i < position.size();i++) {
					for (int j = 0;j < position.get(i).getListCoordonnée().size();j++)
						if (position.get(i).getCoordonnée(j) 
								!= e.getPosition().get(i).getCoordonnée(j)) return false;
				}
				return true;
			}
		}
		return false;
	}
	
	
	
//	private boolean checkGrid(int pos,ArrayList<Integer> grille) {
//		if (grille.size() == 1) {
//			
//		} else if (grille.size() == 2) {
//			
//		} else if (grille.size() > 2) {
//			
//		}
//		return false;
//	}
}
