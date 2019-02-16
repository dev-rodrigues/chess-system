package chess;

import boardgame.Board;
import boardgame.Piece;

/*
 * @author Carlos Henrique
 * @github github.com/httpsantos
 */
public class ChessPiece extends Piece {
	
	private Color color;
	
	public ChessPiece() {
	}

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
}
