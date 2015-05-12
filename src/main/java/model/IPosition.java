package model;

import java.util.ArrayList;

import netBattleException.OutOfBoundsCoordinate;

public interface IPosition {
	
	public void addcoordonate(int x) throws OutOfBoundsCoordinate;

	public void addcoordonate(int x, int y) throws OutOfBoundsCoordinate;

	public void addcoordonate(int x, int y, int z) throws OutOfBoundsCoordinate;

	public int getCoordonate(int index);
	
	public ArrayList<Integer> getCoordonate();

	public ArrayList<Integer> getListCoordonate();
}