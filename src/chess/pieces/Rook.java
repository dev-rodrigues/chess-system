package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

/*
 * @author Carlos Henrique
 * @github github.com/httpsantos
 */
public class Rook extends ChessPiece {
	
	public Rook(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "R";
	}
}
