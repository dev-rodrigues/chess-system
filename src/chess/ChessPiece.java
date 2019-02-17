package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

/*
 * @author Carlos Henrique
 * @github github.com/httpsantos
 */
public abstract class ChessPiece extends Piece {

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
	
	protected boolean isThereOpponenPiece(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p!= null && p.getColor() != color; // opponent piece
	}
}
