package models;

import java.util.concurrent.ConcurrentHashMap;

import interfaces.IBoard;
import interfaces.ICell;

public class ChessBoard implements IBoard{

	ConcurrentHashMap<String, ConcurrentHashMap<String, Cell>> board;

	public ChessBoard(){
		this.board = new ConcurrentHashMap<String, ConcurrentHashMap<String, Cell>>();
	}
	
	public ConcurrentHashMap<String, ConcurrentHashMap<String, Cell>> getBoard() {
		return board;
	}

	public void setBoard(ConcurrentHashMap<String, ConcurrentHashMap<String, Cell>> board) {
		this.board = board;
	}
}
