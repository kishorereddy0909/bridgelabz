package com.bridgelabz.logicalprograms;

import java.util.Random;

public class Util {
	
	public static void calculate(int stack,int goal) {
		int wins=0;
		int noOftimes = 0;
		int losses = 0;
		while(stack > 0 && stack <= goal) {
			double res = Math.random();
			if(res >= 0.5) {
				wins++;
				stack++;
			}else if(res < 0.5) {
				losses++;
				stack--;
			}
			noOftimes++;
		}
		System.out.println(wins + " times win out of "+noOftimes);
		double win = wins/(double)noOftimes*100;
		double loss = losses/(double)noOftimes*100;
		System.out.println("win % is: "+win);
		System.out.println("loss % is: "+loss);
		return;
	}
	
	public static String couponCode(char[] chars) { 
		
		/*
		 * length of coupen
		 */
		int max = 100000000;
		/*
		 * random value
		 */
		double d = Math.random();
		int random = (int) (d * max);
		String sb = "";
		System.out.println("random double " + d + " random at start " + random);

		while (random > 0) {
			sb = sb + (chars[random % chars.length]);
			random /= chars.length;
		}

		String couponCode = sb.toString();
		
		
		return couponCode;
		
	}
	
}
	
	class Game {
		private char[][] board;
		private char currentPlayer;

		public Game() {
			// create 2d array with size of [3][3]
			board = new char[3][3];
			// assigan a character to currentplayer
			currentPlayer = 'x';
			intializeBoard();
		}

		// return the current player
		public char currentPlayer() {
			return currentPlayer;

		}

		// intializing the board
		public void intializeBoard() {
			// calling the print method
			printRow();
		}

		// intializing the row and col character
		private void printRow() {
			for (int row = 0; row < board.length; row++) {
				printColoum(row);
			}

		}

		private void printColoum(int row) {
			for (int col = 0; col < board.length; col++) {
				board[row][col] = '-';
			}

		}

		// printing the board layout
		public void printBoard() {
			System.out.println("-------");
			printRowBoard();
		}

		private void printRowBoard() {
			for (int row = 0; row < board.length; row++) {
				System.out.print("|");
				printColBoard(row);
			}
		}

		private void printColBoard(int row) {
			for (int col = 0; col < board.length; col++) {
				System.out.print(board[row][col] + "|");
			}
			System.out.println();
			System.out.println("-------");

		}

		// checking the board isfull or not
		public boolean isBoardFull() {
			boolean isFull = true;
			for (int row = 0; row < board.length; row++) {
				for (int col = 0; col < board.length; col++) {
					if (board[row][col] == '-') {
						isFull = false;
					}
				}
			}
			return isFull;

		}

		// returning the player has winner or not
		public boolean isWinner() {
			return (checkRows() || checkColoumns() || checkDiagonals());

		}

		// returing the diagonal values
		private boolean checkDiagonals() {

			return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true)
					|| (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));
		}

		// returning the coloumns values
		private boolean checkColoumns() {
			for (int row = 0; row < board.length; row++) {
				if (checkRowCol(board[0][row], board[1][row], board[2][row]) == true) {
					return true;
				}
			}
			return false;

		}

		// returning the row values
		private boolean checkRows() {
			for (int row = 0; row < board.length; row++) {
				if (checkRowCol(board[row][0], board[row][1], board[row][2]) == true) {
					return true;
				}
			}
			return false;
		}

		// returning the row and coloumn are equal or not
		private boolean checkRowCol(char c, char d, char e) {

			return ((c != '-') && (c == d) && (d == e));
		}

		// changing the player
		public void changePlayer() {
			if (currentPlayer == 'x') {
				currentPlayer = 'o';
			} else {
				currentPlayer = 'x';
			}
		}

		// placing the mark of player
		public boolean placeMark(int row, int col) {
			if ((row >= 0) && (row < board.length)) {
				if ((col >= 0) && (col < board.length)) {
					if (board[row][col] == '-') {
						board[row][col] = currentPlayer;
						return true;
					}
				}
			}
			return false;

		}

	}

