package model;

import java.util.ArrayList;

import netBattleException.IllegalGridDimension;
import netBattleException.IllegalPositionMatch;
import netBattleException.IllegalValuePosition;
import netBattleException.NullPointerPosition;
import controller.TypeIHM;


public class Jeux {
	private ArrayList<Joueur> joueurs;
	private ArrayList<Ennemi> ennemis;
	private ArrayList<Integer> scores;
	private int nbrEnnemi;
	private Grille plateau;
	private TypeIHM typeIHM;
	private int maxX;
	private int minX;
	private int maxY;
	private int minY;
	private int maxZ;
	private int minZ;
	
	
	public Jeux() throws IllegalGridDimension {
		joueurs = new ArrayList<Joueur>();
		ennemis = new ArrayList<Ennemi>();
		scores = new ArrayList<Integer>();
		nbrEnnemi = 0;
		plateau = new Grille();
	}
	
	public void setPlateau(Grille plateau) {
		this.plateau = plateau;
	}

	public Grille getPlateau() {
		return plateau;
	}
	
	public void setNbrEnnemi(int nbrEnnemi) {
		this.nbrEnnemi = nbrEnnemi;
	}

	public ArrayList<Joueur> getJoueurs() {
		return joueurs;
	}

	public ArrayList<Ennemi> getEnnemis() {
		return ennemis;
	}

	public ArrayList<Integer> getScores() {
		return scores;
	}

	public int getNbrEnnemi() {
		return nbrEnnemi;
	}

	public ArrayList<Position> generationAleatoireEnnemi(Ennemi e) throws IllegalPositionMatch, NullPointerPosition, IllegalValuePosition {
		ArrayList<Position> positionsHazard = new ArrayList<Position>();
		if (plateau.gettGrille().equals(TypeGrille._1D)) {
			maxX = plateau.getLongueurX();
			minX = 0;
			int xHasard;
			for (int i = 0;i < e.getLongeurEnnemi();i++) {
				xHasard = (int) (Math.random() * (maxX - minX ));
				Position pAléa = new Position(xHasard);
				for(Position p : positionsHazard) {
					while (p.equals(pAléa)) xHasard = (int) (Math.random() * ( maxX - minX ));
				}
				pAléa = new Position(xHasard);
				positionsHazard.add(pAléa);
			}
		} else if (plateau.gettGrille().equals(TypeGrille._2D)) {
			maxX = plateau.getLongueurX();
			minX = 0;
			maxY = plateau.getLongueurY();
			minY = 0;
			int xHasard, yHasard;
			
			for (int i = 0;i < e.getLongeurEnnemi();i++) {
				xHasard = (int) (Math.random() * (maxX - minX ));
				yHasard = (int) (Math.random() * (maxY - minY ));
				Position pAléa = new Position(xHasard,yHasard);
				for(Position p : positionsHazard) {
					while (p.equals(pAléa)) {
						xHasard = (int) (Math.random() * (maxX - minX ));
						yHasard = (int) (Math.random() * (maxY - minY ));
					}
				}
				pAléa = new Position(xHasard,yHasard);
				positionsHazard.add(pAléa);
			}			
		} else if (plateau.gettGrille().equals(TypeGrille._3D)) {
			maxX = plateau.getLongueurX();
			minX = 0;
			maxY = plateau.getLongueurY();
			minY = 0;
			maxZ = plateau.getLongueurZ();
			minZ = 0;
			int xHasard, yHasard, zHasard;
			
			for (int i = 0;i < e.getLongeurEnnemi();i++) {
				xHasard = (int) (Math.random() * (maxX - minX ));
				yHasard = (int) (Math.random() * (maxY - minY ));
				zHasard = (int) (Math.random() * (maxZ - minZ ));
				Position pAléa = new Position(xHasard,yHasard,zHasard);
				for(Position p : positionsHazard) {
					while (p.equals(pAléa)) {
						xHasard = (int) (Math.random() * (maxX - minX ));
						yHasard = (int) (Math.random() * (maxY - minY ));
						zHasard = (int) (Math.random() * (maxZ - minZ ));
					}
				}
				pAléa = new Position(xHasard,yHasard,zHasard);
				positionsHazard.add(pAléa);
			}
		}
		return positionsHazard;
	}
	
	public void generationAllEnnemis(int lEnnemi) throws IllegalPositionMatch, NullPointerPosition, IllegalValuePosition {
		for (int i = 0;i < nbrEnnemi;i++) {
			Ennemi eTmp = new Ennemi();
			eTmp.setLongeurEnnemi(lEnnemi);
			for (Position p : generationAleatoireEnnemi(eTmp))
				eTmp.addPosition(p);
			ennemis.add(eTmp);
		}
	}

}
