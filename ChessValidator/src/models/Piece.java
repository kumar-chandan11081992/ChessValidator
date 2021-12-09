package models;

import interfaces.IPiece;

public class Piece implements IPiece{

	Cell cell;
	String name;
	public Piece(){
	}
	public Cell getCell() {
		return cell;
	}
	public void setCell(Cell cell) {
		this.cell = cell;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public int[] getdx() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int[] getdy() {
		// TODO Auto-generated method stub
		return null;
	}
}
