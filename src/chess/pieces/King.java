package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

/*
 * @author Carlos Henrique
 * @github github.com/httpsantos
 */
public class King extends ChessPiece {
	
	public King(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "K";
	}

	/*
	 * @see boardgame.Piece#possibleMoves()
	 */
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()] [getBoard().getColumns()];
		return mat;
	}
}