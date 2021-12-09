package factory;

import interfaces.IPiece;
import models.Bishop;
import models.King;
import models.Knight;
import models.Pawn;
import models.Piece;
import models.Queen;
import models.Rook;

public class PieceFactory {

	public static IPiece getPiece(String pieceName) {
		if(pieceName.equals("Bishop")) {
			return new Bishop();
		}
		else if(pieceName.equals("Rook")) {
			return new Rook();
		}
		else if(pieceName.equals("Pawn")) {
			return new Pawn();
		}
		else if(pieceName.equals("Queen")) {
			return new Queen();
		}
		else if(pieceName.equals("King")) {
			return new King();
		}
		else if(pieceName.equals("Knight")) {
			return new Knight();
		}
		
		return null;
	}
}
