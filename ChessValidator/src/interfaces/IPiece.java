package interfaces;

import models.Cell;

public interface IPiece {
	
	public void setCell(Cell  cell);
	public void setName(String  name);
	public String getName();
	public int[] getdx();
	public int[] getdy();

}
