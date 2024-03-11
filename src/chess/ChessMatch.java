package chess;

import boardGame.Board;

public class ChessMatch {
	private Board board;
	
	public ChessMatch() {
		board = new Board(8,8);
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.pice(i, j); 
				//downcast transformando uma peça da camada de Tabuleiro para uma peça da camada de xadres
			}
		}
		return mat;	
	}
	
	
	
}
