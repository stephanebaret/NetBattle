package console;

import java.io.IOException;
import java.util.Scanner;

import model.Joueur;
import netBattleException.IllegalCaracterException;
import netBattleException.IllegalGridDimension;
import netBattleException.IllegalPositionMatch;
import netBattleException.IllegalValuePosition;
import netBattleException.NullPointerPosition;

public class Main {
	// Scanner pour les entrées clavier
	static Scanner clavier;
	static NetBattle netBattle;
	
	public static void main(String[] args) {
		clavier = new Scanner(System.in);
		try {
			netBattle.start();
			netBattle.play();
		} catch (IndexOutOfBoundsException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
