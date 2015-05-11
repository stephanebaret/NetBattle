package model;

import netBattleException.IllegalGridDimension;
import netBattleException.IllegalPositionMatch;
import netBattleException.IllegalValuePosition;
import netBattleException.NullPointerPosition;

public class JeuxTestDrive {

	public static void main(String[] args) {
		try {
			System.out.println("Test plateau 1D :");
			Jeux j = new Jeux();
			j.setPlateau(new Grille(TypeGrille._1D,10));
			j.setNbrEnnemi(1);
			j.generationAllEnnemis(1);
			System.out.println(j.getEnnemis().get(0).getPosition().toString());
			for (int i = 0;i < 10; i++)
				System.out.println(i + " " + j.getEnnemis().get(0).checkGuess(new Position(i)));
			
			j.setPlateau(new Grille(TypeGrille._1D,10));
			j.getEnnemis().clear();
			j.setNbrEnnemi(1);
			j.generationAllEnnemis(3);
			System.out.println(j.getEnnemis().get(0).getPosition().toString());
			for (int i = 0;i < 10; i++)
				System.out.println(i + " " + j.getEnnemis().get(0).checkGuess(new Position(i)));
			
			System.out.println("Test plateau 2D :");
			j = new Jeux();
			j.setPlateau(new Grille(TypeGrille._2D,10,10));
			j.setNbrEnnemi(1);
			j.generationAllEnnemis(1);
			System.out.println(j.getEnnemis().get(0).getPosition().toString());
			for (int i = 0;i < 10; i++)
				for (int k = 0; k < 10; k++)
					System.out.println(i + " " + k + " "
							+ j.getEnnemis().get(0).checkGuess(new Position(i,k)));
			
			j.setPlateau(new Grille(TypeGrille._2D,10,10));
			j.getEnnemis().clear();
			j.setNbrEnnemi(1);
			j.generationAllEnnemis(3);
			System.out.println(j.getEnnemis().get(0).getPosition().toString());
			for (int i = 0;i < 10; i++)
				for (int k = 0; k < 10; k++)
					System.out.println(i + " " + k + " "
							+ j.getEnnemis().get(0).checkGuess(new Position(i,k)));
			
			System.out.println("Test plateau 3D :");
			j = new Jeux();
			j.setPlateau(new Grille(TypeGrille._3D,10,10,10));
			j.setNbrEnnemi(1);
			j.generationAllEnnemis(1);
			System.out.println(j.getEnnemis().get(0).getPosition().toString());
			for (int i = 0;i < 10; i++)
				for (int k = 0; k < 10; k++)
					for (int l = 0; l < 10; l++)
						System.out.println(i + " " + k + " " + l + " "
							+ j.getEnnemis().get(0).checkGuess(new Position(i,k,l)));
			
			j.setPlateau(new Grille(TypeGrille._3D,10,10,10));
			j.getEnnemis().clear();
			j.setNbrEnnemi(1);
			j.generationAllEnnemis(3);
			System.out.println(j.getEnnemis().get(0).getPosition().toString());
			for (int i = 0;i < 10; i++)
				for (int k = 0; k < 10; k++)
					for (int l = 0; l < 10; l++)
						System.out.println(i + " " + k + " " + l + " "
							+ j.getEnnemis().get(0).checkGuess(new Position(i,k,l)));
			
		} catch (IllegalGridDimension | IllegalPositionMatch | NullPointerPosition | IllegalValuePosition e) {
			e.printStackTrace();
		}
	}

}
