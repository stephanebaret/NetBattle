package model;

import java.util.ArrayList;

import netBattleException.IllegalPositionMatch;
import netBattleException.IllegalValuePosition;
import netBattleException.NullPointerPosition;

public class EnnemiTestDrive {

	public static void main(String[] args) {
		Ennemi e = new Ennemi();
		ArrayList<Position> testPos = null;
		
//		try {
//			e.setPosition(testPos);
//			System.out.println("nok");
//		} catch (IllegalPositionMatch e1) {
//			System.out.println("nok");
//			//e1.printStackTrace();
//		} catch (NullPointerPosition e1) {
//			System.out.println("ok");
//			//e1.printStackTrace();
//		} catch (IllegalValuePosition e1) {
//			System.out.println("nok");
//			//e1.printStackTrace();
//		}
//		
//		Position p1 = new Position(1);
//		testPos = new ArrayList<Position>();
//		testPos.add(p1);
//		testPos.add(null);
//		
//		e.getPosition().clear();
//		e.getPosition().add(p1);
//		e.getPosition().add(new Position(2));
//
//		try {
//			e.setPosition(testPos);
//			System.out.println("nok");
//		} catch (IllegalPositionMatch e1) {
//			System.out.println("nok");
////			e1.printStackTrace();
//		} catch (NullPointerPosition e1) {
//			System.out.println("ok");
////			e1.printStackTrace();
//		} catch (IllegalValuePosition e1) {
//			System.out.println("nok");
////			e1.printStackTrace();
//		}
//		
//		testPos.clear();
//		testPos.add(new Position(-1));
//		e.getPosition().clear();
//		e.getPosition().add(p1);
//		
//		try {
//			e.setPosition(testPos);
//			System.out.println("nok");
//		} catch (IllegalPositionMatch e1) {
//			System.out.println("nok");
////			e1.printStackTrace();
//		} catch (NullPointerPosition e1) {
//			System.out.println("nok");
////			e1.printStackTrace();
//		} catch (IllegalValuePosition e1) {
//			System.out.println("ok");
////			e1.printStackTrace();
//		}
//		
//		Ennemi e2 = new Ennemi();
//		e2.addPosition(new Position(1));
//		e.getPosition().clear();
//		e.getPosition().add(p1);
//		
//		if (e.equals(e2))
//			System.out.println("ok");
//		else
//			System.out.println("nok");
//		
//		e2.getPosition().clear();
//		e2.addPosition(new Position(3));
//		e.getPosition().clear();
//		e.getPosition().add(p1);
//		
//		if (!e.equals(e2))
//			System.out.println("ok");
//		else
//			System.out.println("nok");
//		
//		e2.getPosition().clear();
//		e2.addPosition(new Position(3,4));
//		e.getPosition().clear();
//		e.getPosition().add(p1);
//		
//		if (!e.equals(e2))
//			System.out.println("ok");
//		else
//			System.out.println("nok");
//		
//		e.getPosition().clear();
//		e.getPosition().add(new Position(3));
//		e.setLongeurEnnemi(3);
//		e.setHit(0);
//		Position pos = new Position(0);
//		String s = e.checkGuess(pos).toString();
////		System.out.println(s);
//		if (s.equals("Raté!")) System.out.println("ok");
//		else
//			System.out.println("nok");
//		
//		e.getPosition().clear();
//		e.getPosition().add(new Position(3));
//		e.setLongeurEnnemi(3);
//		e.setHit(0);
//		pos = new Position(3);
//		s = e.checkGuess(pos).toString();
////		System.out.println(s);
//		if (s.equals("Touché")) System.out.println("ok");
//		else
//			System.out.println("nok");
//		
//		e.getPosition().clear();
//		e.getPosition().add(new Position(3));
//		e.setLongeurEnnemi(1);
//		e.setHit(0);
//		pos = new Position(3);
//		s = e.checkGuess(pos).toString();
////		System.out.println(s);
////		System.out.println(e.getHit());
//		if (s.equals("Coulé!")) System.out.println("ok");
//		else
//			System.out.println("nok");
//		
//		e.getPosition().clear();
//		e.getPosition().add(new Position(3,4));
//		e.setLongeurEnnemi(3);
//		e.setHit(0);
//		pos = new Position(3,5);
//		s = e.checkGuess(pos).toString();
////		System.out.println(s);
//		if (s.equals("Raté!")) System.out.println("ok");
//		else
//			System.out.println("nok");
//		
//		e.getPosition().clear();
//		e.getPosition().add(new Position(3,4));
//		e.setLongeurEnnemi(3);
//		e.setHit(0);
//		pos = new Position(3,4);
//		s = e.checkGuess(pos).toString();
////		System.out.println(s);
//		if (s.equals("Touché")) System.out.println("ok");
//		else
//			System.out.println("nok");
//		
//		e.getPosition().clear();
//		e.getPosition().add(new Position(3,4));
//		e.setLongeurEnnemi(1);
//		e.setHit(0);
//		pos = new Position(3,4);
//		s = e.checkGuess(pos).toString();
////		System.out.println(s);
////		System.out.println(e.getHit());
//		if (s.equals("Coulé!")) System.out.println("ok");
//		else
//			System.out.println("nok");
//		
//		e.getPosition().clear();
//		e.getPosition().add(new Position(3,4,5));
//		e.setLongeurEnnemi(3);
//		e.setHit(0);
//		pos = new Position(3,5,6);
//		s = e.checkGuess(pos).toString();
////		System.out.println(s);
//		if (s.equals("Raté!")) System.out.println("ok");
//		else
//			System.out.println("nok");
//		
//		e.getPosition().clear();
//		e.getPosition().add(new Position(3,4,5));
//		e.setLongeurEnnemi(3);
//		e.setHit(0);
//		pos = new Position(3,4,5);
//		s = e.checkGuess(pos).toString();
////		System.out.println(s);
//		if (s.equals("Touché")) System.out.println("ok");
//		else
//			System.out.println("nok");
//		
//		e.getPosition().clear();
//		e.getPosition().add(new Position(3,4,5));
//		e.setLongeurEnnemi(1);
//		e.setHit(0);
//		pos = new Position(3,4,5);
//		s = e.checkGuess(pos).toString();
////		System.out.println(s);
////		System.out.println(e.getHit());
//		if (s.equals("Coulé!")) System.out.println("ok");
//		else
//			System.out.println("nok");
	}

}
