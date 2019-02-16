package boardgame;

/*
 * @author Carlos Henrique
 * @github github.com/httpsantos
 */
public class Piece {
	protected Position position;
	private Board board;
	
	public Piece() {
	}

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}
}
