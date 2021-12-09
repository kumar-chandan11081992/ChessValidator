package facade;

import java.util.concurrent.ConcurrentHashMap;

import factory.PieceFactory;
import interfaces.IBoard;
import interfaces.IPiece;
import models.Cell;
import models.ChessBoard;
import services.BoardService;

public class AppFacade {

	BoardService boardService;
	String[] colIndex = {"a", "b", "c", "d", "e", "f", "g", "h"}; 
	String[] rowIndex = {"1", "2", "3", "4", "5", "6", "7", "8"};
	ConcurrentHashMap<String, ConcurrentHashMap<String, Cell>> board;
	
	public AppFacade(){
		IBoard board = new ChessBoard();
		PieceFactory factory = new PieceFactory();
		this.boardService = new BoardService(board, factory);
	}
	
	public void initializeBoard() {
		ConcurrentHashMap<String, ConcurrentHashMap<String, Cell>> boardFromService = this.boardService.initialiseBoard();
		this.board = boardFromService;
		return;
	}
	public void showBoard() {
		ConcurrentHashMap<String, ConcurrentHashMap<String, Cell>> board = this.board;
		for(int i = 7; i >= 0; i--) {
			for(int j = 0; j<8 ;j++) {
				IPiece x = board.get(colIndex[j]).get(rowIndex[i]).getPiece();
				String name = x == null ? "--" : x.getName();
				System.out.print( name + " ");
			}
			System.out.println("");
		}
	}
	
	public boolean validateMove(char colsrc, char rowsrc, char coldest, char rowdest) {
		return this.boardService.validateMove(String.valueOf(coldest), String.valueOf(rowsrc), String.valueOf(coldest), String.valueOf(rowdest));
	}
	public void movePiece(char colsrc, char rowsrc, char coldest, char rowdest) {
		this.boardService.movePiece(String.valueOf(coldest), String.valueOf(rowsrc), String.valueOf(coldest), String.valueOf(rowdest));
		return;
	}
}
