package services;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

import enums.Color;
import factory.PieceFactory;
import interfaces.IBoard;
import interfaces.ICell;
import interfaces.IPiece;
import models.Cell;
import models.Knight;
import models.Piece;
import models.Rook;

public class BoardService {

	IBoard board;
	PieceFactory pieceFactory;
	HashMap<String, Integer> hmcol;
	
	public BoardService(IBoard board, PieceFactory pieceFactory) {
		this.board = board;
		this.pieceFactory = pieceFactory;
		this.hmcol = new HashMap<>();
		this.hmcol.put("a", 1);
		this.hmcol.put("b", 2);
		this.hmcol.put("c", 3);
		this.hmcol.put("d", 4);
		this.hmcol.put("e", 5);
		this.hmcol.put("f", 6);
		this.hmcol.put("g", 7);
		this.hmcol.put("h", 8);
	}
	
	public ConcurrentHashMap<String, ConcurrentHashMap<String, Cell>> initialiseBoard() {
		ConcurrentHashMap<String, ConcurrentHashMap<String, Cell>> board = this.board.getBoard();
		
		String[] colIndex = {"a", "b", "c", "d", "e", "f", "g", "h"}; 
		String[] rowIndex = {"1", "2", "3", "4", "5", "6", "7", "8"}; 
		
		Color[] color = {Color.WHITE , Color.BLACK};
		int colorIndex = 0;
		for(int i = 0; i< colIndex.length; i=i+2) {
			ConcurrentHashMap<String, Cell> col1 = new ConcurrentHashMap<String, Cell>();
			col1.put("1", new Cell("1",colIndex[i],Color.BLACK));
			col1.put("2", new Cell("2",colIndex[i],Color.WHITE));
			col1.put("3", new Cell("3",colIndex[i],Color.BLACK));
			col1.put("4", new Cell("4",colIndex[i],Color.WHITE));
			col1.put("5", new Cell("5",colIndex[i],Color.BLACK));
			col1.put("6", new Cell("6",colIndex[i],Color.WHITE));
			col1.put("7", new Cell("7",colIndex[i],Color.BLACK));
			col1.put("8", new Cell("8",colIndex[i],Color.WHITE));
			
			board.put(colIndex[i], col1);
		}
		
		for(int i = 1; i< colIndex.length; i=i+2) {
			ConcurrentHashMap<String, Cell> col2 = new ConcurrentHashMap<String, Cell>();
			col2.put("1", new Cell("1",colIndex[i],Color.WHITE));
			col2.put("2", new Cell("2",colIndex[i],Color.BLACK));
			col2.put("3", new Cell("3",colIndex[i],Color.WHITE));
			col2.put("4", new Cell("4",colIndex[i],Color.BLACK));
			col2.put("5", new Cell("5",colIndex[i],Color.WHITE));
			col2.put("6", new Cell("6",colIndex[i],Color.BLACK));
			col2.put("7", new Cell("7",colIndex[i],Color.WHITE));
			col2.put("8", new Cell("8",colIndex[i],Color.BLACK));
			board.put(colIndex[i], col2);
		}
		
		Cell cell1 = board.get("a").get("1");
		IPiece wr1 = pieceFactory.getPiece("Rook");
		wr1.setCell(cell1);
		wr1.setName("wr");
		cell1.setPiece(wr1);
		
		Cell cell8 = board.get("h").get("1");
		IPiece wr2 = pieceFactory.getPiece("Rook");
		wr2.setCell(cell1);
		wr2.setName("wr");
		cell1.setPiece(wr2);
		
		Cell cell2 = board.get("b").get("1");
		IPiece wk1 = pieceFactory.getPiece("Knight");
		wk1.setCell(cell1);
		wk1.setName("wk");
		cell2.setPiece(wk1);
		
		Cell cell7 = board.get("g").get("1");
		IPiece wk2 = pieceFactory.getPiece("Knight");
		wk2.setCell(cell1);
		wk2.setName("wk");
		cell7.setPiece(wk2);
		
		Cell cell3 = board.get("c").get("1");
		IPiece wb1 = pieceFactory.getPiece("Bishop");
		wb1.setCell(cell1);
		wb1.setName("wb");
		cell3.setPiece(wb1);
		
		Cell cell6 = board.get("f").get("1");
		IPiece wb2 = pieceFactory.getPiece("Bishop");
		wb2.setCell(cell1);
		wb2.setName("wb");
		cell6.setPiece(wb2);
		
		Cell cell4 = board.get("d").get("1");
		IPiece wq = pieceFactory.getPiece("Queen");
		wq.setCell(cell4);
		wq.setName("wq");
		cell4.setPiece(wq);
		
		Cell cell5 = board.get("e").get("1");
		IPiece wk = pieceFactory.getPiece("King");
		wk.setCell(cell5);
		wk.setName("wk");
		cell5.setPiece(wk);
		
		
		
		for(int i =0; i < 8; i++) {
			Cell cell = board.get(colIndex[i]).get("2");
			IPiece wp = pieceFactory.getPiece("Pawn");
			wp.setCell(cell);
			wp.setName("wp");
			cell.setPiece(wp);
		}
		
		
		Cell cell81 = board.get("a").get("8");
		IPiece br1 = pieceFactory.getPiece("Rook");
		br1.setCell(cell81);
		br1.setName("br");
		cell81.setPiece(br1);
		
		Cell cell88 = board.get("h").get("8");
		IPiece br2 = pieceFactory.getPiece("Rook");
		br2.setCell(cell88);
		br2.setName("br");
		cell88.setPiece(br2);
		
		Cell cell82 = board.get("b").get("8");
		IPiece bk1 = pieceFactory.getPiece("Knight");
		bk1.setCell(cell82);
		bk1.setName("bk");
		cell82.setPiece(bk1);
		
		Cell cell87 = board.get("g").get("8");
		IPiece bk2 = pieceFactory.getPiece("Knight");
		bk2.setCell(cell87);
		bk2.setName("bk");
		cell87.setPiece(bk2);
		
		Cell cell83 = board.get("c").get("8");
		IPiece bb1 = pieceFactory.getPiece("Bishop");
		bb1.setCell(cell83);
		bb1.setName("bb");
		cell83.setPiece(bb1);
		
		Cell cell86 = board.get("f").get("8");
		IPiece bb2 = pieceFactory.getPiece("Bishop");
		bb2.setCell(cell86);
		bb2.setName("bb");
		cell86.setPiece(bb2);
		
		Cell cell84 = board.get("d").get("8");
		IPiece bq = pieceFactory.getPiece("Queen");
		bq.setCell(cell84);
		bq.setName("bq");
		cell84.setPiece(bq);
		
		Cell cell85 = board.get("e").get("8");
		IPiece bk = pieceFactory.getPiece("King");
		bk.setCell(cell85);
		bk.setName("bk");
		cell85.setPiece(bk);
		
		for(int i =0; i < 8; i++) {
			Cell cell = board.get(colIndex[i]).get("7");
			IPiece bp = pieceFactory.getPiece("Pawn");
			bp.setCell(cell);
			bp.setName("bp");
			cell.setPiece(bp);
		}
		
		return board;
	}
	
	public boolean validateMove(String colsrc, String rowsrc, String coldest, String rowdest) {
		if(this.hmcol.get(colsrc) == null || Integer.valueOf(rowsrc) < 1 ||  Integer.valueOf(rowdest) > 8 || this.hmcol.get(coldest) == null)
				return false;
		
		Cell sourceCell = this.board.getBoard().get(colsrc).get(rowsrc);
		Cell destCell = this.board.getBoard().get(coldest).get(rowdest);
		
		if(destCell.getPiece() != null) {
			return false;
		}
		
		int xDiff = this.hmcol.get(sourceCell.getColoumn()) - this.hmcol.get(destCell.getColoumn());
		int yDiff = Integer.valueOf(sourceCell.getRow()) - Integer.valueOf(destCell.getRow());
		int[] dx = sourceCell.getPiece().getdx();
		int[] dy = sourceCell.getPiece().getdy();
		
		for(int i = 0; i< dx.length; i++) {
			if(xDiff == dx[i] && yDiff == dy[i])
				return true;
		}
		
		return false;
	}
	
	public void movePiece(String colsrc, String rowsrc, String coldest, String rowdest) {
		
		Cell sourceCell = this.board.getBoard().get(colsrc).get(rowsrc);
		Cell destCell = this.board.getBoard().get(coldest).get(rowdest);
		
		IPiece sourcePiece = sourceCell.getPiece();
		sourceCell.setPiece(null);
		destCell.setPiece(sourcePiece);
		return;
	}
}
