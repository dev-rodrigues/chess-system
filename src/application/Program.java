package application;

import chess.ChessMatch;
import util.UI;

/*
 * @author Carlos Henrique
 * @github github.com/httpsantos
 */
public class Program {

	public static void main(String[] args) {
		ChessMatch c = new ChessMatch();
		UI.printBoard(c.getPieces());
	}
}
