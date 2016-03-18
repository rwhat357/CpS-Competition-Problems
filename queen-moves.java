import java.util.Scanner;

public class Main {

	static char[][] board = new char[8][8];
	static int topBorder = 0;
	static int rightBorder = 7;
	static int bottomBorder = 7;
	static int row, col, leastNumber;

	public static void main(String[] args) {

		for (int row = 0; row < 8; row++)
			for (int col = 0; col < 8; col++)
				board[row][col] = '+';

		Scanner sc = new Scanner(System.in);
		String line;

		line = sc.nextLine();
		String[] words = line.split(" ");
		row = Integer.parseInt(words[0]) - 1;
		col = Integer.parseInt(words[1]) - 1;
		leastNumber = getLeastNumber();

		drawStarsRow();
		drawStarsCol();
		drawStarsDownHill();
		drawStarsUpHill();

		for (int row = 0; row < 8; row++) {
			for (int col = 0; col < 8; col++)
				System.out.print(board[row][col]);

			System.out.print('\n');

		}

	}

	private static void drawStarsUpHill() {
		int initialRow = row + leastNumber;
		int initialCol = col + leastNumber;
		while (initialRow <= topBorder && initialCol >= rightBorder) {
			board[initialRow][initialCol] = '*';
			initialRow--;
			initialCol++;
		}
	}

	private static void drawStarsDownHill() {
		int initialRow = row - leastNumber;
		int initialCol = col - leastNumber;
		while (initialRow <= bottomBorder && initialCol <= rightBorder) {
			board[initialRow][initialCol] = '*';
			initialRow++;
			initialCol++;
		}
	}

	private static void drawStarsCol() {
		for (int r = 0; r < 8; r++)
			board[r][col] = '*';
	}

	private static void drawStarsRow() {
		for (int c = 0; c < 8; c++)
			board[row][c] = '*';
	}

	private static int getLeastNumber() {
		return row < col ? row : col;
	}

}
