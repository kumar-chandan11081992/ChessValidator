package models;

import enums.Color;
import interfaces.IBoard;
import interfaces.IPiece;

public class Cell {
String row;
String coloumn;
boolean isOccupied = false;
Color color;
IPiece piece;

public Cell(String row, String col, Color color){
	this.row = row;
	this.coloumn = col;
	this.color = color;
}

public void setOccupied(boolean isOccupied) {
	this.isOccupied = isOccupied;
}

public void setColor(Color color) {
	this.color = color;
}

public String getRow() {
	return row;
}

public void setRow(String row) {
	this.row = row;
}

public String getColoumn() {
	return coloumn;
}

public void setColoumn(String coloumn) {
	this.coloumn = coloumn;
}

public IPiece getPiece() {
	return piece;
}

public void setPiece(IPiece piece) {
	this.piece = piece;
}

public boolean isOccupied() {
	return isOccupied;
}

public Color getColor() {
	return color;
}




}
