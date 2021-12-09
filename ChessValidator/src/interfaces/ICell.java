package interfaces;

import enums.Color;

public interface ICell {

	public void setOccupied(boolean isOccupied);
	public void setColor(Color color);
	
	public String getRow();

	public String getColoumn();

	public IPiece getPiece();
	public boolean isOccupied();

	public Color getColor();
}
