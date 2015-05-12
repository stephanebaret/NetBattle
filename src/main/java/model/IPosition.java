package model;

import java.util.ArrayList;

import netBattleException.OutOfBoundsCoordinate;

public interface IPosition {
	
	public void addcoordonate(int x) throws OutOfBoundsCoordinate;

	public void addcoordonate(int x, int y) throws OutOfBoundsCoordinate;

	public void addcoordonate(int x, int y, int z) throws OutOfBoundsCoordinate;

	public ArrayList<Integer> getCoordonnée();

	public ArrayList<Integer> getListCoordonnée();
}