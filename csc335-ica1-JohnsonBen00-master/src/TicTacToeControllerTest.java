import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TicTacToeControllerTest {

	@Test
	void testIsGameOver() {
		TicTacToeModel board = new TicTacToeModel();
		TicTacToeController ticTacToe = new TicTacToeController(board);
		
		assertFalse(ticTacToe.isGameOver());
	}
	@Test
	void testIsGameOver2() {
		TicTacToeModel board = new TicTacToeModel();
		TicTacToeController ticTacToe = new TicTacToeController(board);
		
		board.BLANK = 1;
		assertTrue(ticTacToe.isGameOver());
	}
	@Test
	void testIsGameOver3() {
		TicTacToeModel board = new TicTacToeModel();
		TicTacToeController ticTacToe = new TicTacToeController(board);
		
		board.BLANK = 0;
		board.placeO(0, 0);
		board.placeO(0, 1);
		board.placeO(0, 2);
		assertTrue(ticTacToe.isGameOver());
	}
	@Test
	void testIsGameOver4() {
		TicTacToeModel board = new TicTacToeModel();
		TicTacToeController ticTacToe = new TicTacToeController(board);
		
		board.BLANK = 0;
		board.placeO(0, 0);
		board.placeO(1, 0);
		board.placeO(2, 0);
		assertTrue(ticTacToe.isGameOver());
	}
	@Test
	void testIsGameOver5() {
		TicTacToeModel board = new TicTacToeModel();
		TicTacToeController ticTacToe = new TicTacToeController(board);
		
		board.BLANK = 0;
		board.placeO(0, 0);
		board.placeO(1, 1);
		board.placeO(2, 2);
		assertTrue(ticTacToe.isGameOver());
	}
	@Test
	void testIsGameOver6() {
		TicTacToeModel board = new TicTacToeModel();
		TicTacToeController ticTacToe = new TicTacToeController(board);
		
		board.BLANK = 0;
		board.placeO(0, 2);
		board.placeO(1, 1);
		board.placeO(2, 0);
		assertTrue(ticTacToe.isGameOver());
	}
	@Test
	void testIsGameOver7() {
		TicTacToeModel board = new TicTacToeModel();
		TicTacToeController ticTacToe = new TicTacToeController(board);
		
		board.BLANK = 0;
		board.placeX(0, 0);
		board.placeX(0, 1);
		board.placeX(0, 2);
		assertTrue(ticTacToe.isGameOver());
	}
	@Test
	void testIsGameOver8() {
		TicTacToeModel board = new TicTacToeModel();
		TicTacToeController ticTacToe = new TicTacToeController(board);
		
		board.BLANK = 0;
		board.placeX(0, 0);
		board.placeX(1, 0);
		board.placeX(2, 0);
		assertTrue(ticTacToe.isGameOver());
	}
	@Test
	void testIsGameOver9() {
		TicTacToeModel board = new TicTacToeModel();
		TicTacToeController ticTacToe = new TicTacToeController(board);
		
		board.BLANK = 0;
		board.placeX(0, 0);
		board.placeX(1, 1);
		board.placeX(2, 2);
		assertTrue(ticTacToe.isGameOver());
	}
	@Test
	void testIsGameOver10() {
		TicTacToeModel board = new TicTacToeModel();
		TicTacToeController ticTacToe = new TicTacToeController(board);
		
		board.BLANK = 0;
		board.placeX(0, 2);
		board.placeX(1, 1);
		board.placeX(2, 0);
		assertTrue(ticTacToe.isGameOver());
	}

}
