package console;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import model.Jeux;
import model.Joueur;
import model.TypeGrille;
import netBattleException.IllegalCaracterException;
import netBattleException.IllegalGridDimension;
import netBattleException.IllegalPositionMatch;
import netBattleException.IllegalValuePosition;
import netBattleException.NullPointerPosition;

/**
 * <b>NetBattle est le controlleur du jeux en en mode console</b>
 * 
 * <ul>
 * <li>Initilisation des enemies, du plateau, du joueur, du score</li>
 * <ul>
 * 
 * @author BARET Stéphane 
 * 
 */

public class NetBattle {
	Joueur joueur;
	Properties propLastLogin;
	public static final String LASTPLAYER = "\\lastlogin.btt";
	String filename;
	File p;
	
	/**
	 * <b>Initialisation de tous les composant du jeux</b>
	 * 
	 */
	
	public void NetBattle() {
		joueur = new Joueur();
	}
	
	public void start() throws IOException  {		
		filename = System.getProperties().getProperty("user.dir")+LASTPLAYER;
		p = new File(filename);
		propLastLogin = new Properties();
		if (!p.exists()) {
			FileOutputStream fos = new FileOutputStream(p);
			propLastLogin.put("nomJoueur", "Geek");
			propLastLogin.put("score", 999);
			propLastLogin.store(fos,"NetBattle");
		} else {
//			FileInputStream inRead = new FileInputStream(p) ;
//			propLastLogin.load(inRead);
//			inRead.close();
		}
		
//		j = new Jeux();
//		j.getPlateau().settGrille(TypeGrille._1D);
//		j.getPlateau().setLongueurX(7);
//		j.getPlateau().setLongueurY(-1);
//		j.setNombreEnnemi(1);
//		j.getEnemi().setLongeurEnnemi(3);
//		j.getEnemi().setPosition(j.generationEnnemi(j.getNombreEnnemi()));
//		j.setScore(0);
//		j.setMin(0);
//		j.setMax(j.getEnemi().getLongeurEnnemi() - 1);
//
//		System.out.println("ennemi "+j.getEnemi().getPosition().toString());
	}
	
	/**
	 * <b>Démarre la partie et l'interaction en mode console</b>
	 * 
	 * <ul>
	 * <li>s  </li>
	 * </ul>
	 */
	public void play() {
//		String s;
//		
//		System.out.println("Bienvenue dans NetBattle :");
//		do
//		{
//			j.setScore(j.getScore() + 1);
//			s = j.getEnemi().checkGuess(getGuess(j.getJoueur())).toString();
//			System.out.println(s);
//		} while (!((s).equals("Coulé!")));
//		System.out.println("Il vous a fallu " + j.getScore() + " essais!");
//		FileOutputStream fos = new FileOutputStream(p);
//		propLastLogin.put("nomJoueur", joueur.getNom());
//		propLastLogin.put("score", joueur.getScore());
//		propLastLogin.store(fos,"test");
	}
	
	/**
	 * <b>Méthode qui lit le clavier pour recevoir une postion de tir</b>
	 * <ul>
	 * <li>Saisie au clavier une position de tir et renvoi une position correct ou boucle sur la sasie.</li>
	 * </ul>
	 */
	private int getGuess(Joueur j) {
//		do
//		{
//			System.out.print("Veuillez entrez un nombre comrpis entre 0 et 6 : ");
//			String tmp = Main.clavier.next();
//	
//			try {
//				j.setPos(Integer.parseInt(tmp));
//				
//			} catch (NumberFormatException e) {
//				e.printStackTrace();
//				throw new IllegalCaracterException();
//			}
//			
//		} while ((j.getPos() < 0) || (j.getPos() > 7));	
//		
//		return j.getPos();
		return 0;
	}
}
