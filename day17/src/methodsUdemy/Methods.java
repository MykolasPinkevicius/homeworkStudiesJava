package methodsUdemy;

public class Methods {

	public static void main(String[] args) {

		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

		int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println("Your high score was " + highScore);

		calculateScore(true, 800, 5, 100);

		int positionInHighScoreTable = calculateHighScorePosition(1500);
		displayHighScorePosition("Ilidan Hul", positionInHighScoreTable);
		
		positionInHighScoreTable = calculateHighScorePosition(900);
		displayHighScorePosition("Ilidan Hul", positionInHighScoreTable);

		positionInHighScoreTable = calculateHighScorePosition(400);
		displayHighScorePosition("Ilidan Hul", positionInHighScoreTable);

		positionInHighScoreTable = calculateHighScorePosition(50);
		displayHighScorePosition("Ilidan Hul", positionInHighScoreTable);
		
		positionInHighScoreTable = calculateHighScorePosition(1000);
		displayHighScorePosition("Ilidan Hul", positionInHighScoreTable);
		
		positionInHighScoreTable = calculateHighScorePosition(500);
		displayHighScorePosition("Ilidan Hul", positionInHighScoreTable);
		
		positionInHighScoreTable = calculateHighScorePosition(100);
		displayHighScorePosition("Ilidan Hul", positionInHighScoreTable);
	}

	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

		if (gameOver) {
			int finalScore = score + (levelCompleted + bonus);
			finalScore += 2000;
			System.out.println("Your final score was " + finalScore);
			return finalScore;
		} else

			return -1;

	}

	public static void displayHighScorePosition(String playerName, int positionInHighScoreTable) {
		System.out.println(playerName + " managed to get into position " + positionInHighScoreTable + " on the high score table");
	}

	public static int calculateHighScorePosition(int highScore) {
//		if (highScore > 1000) {
//			return 1;
//		} else if (highScore > 500 && highScore <= 1000) {
//			return 2;
//		} else if (highScore >= 100 && highScore <= 500) {
//			return 3;
//		} else { // here we got something that we need to change{
//			return 4;
//		}
		int position = 4;
			
		if(highScore > 1000) {
			position = 1;
		} else if (highScore > 500 && highScore <= 1000) {
			position = 2;
		} else if (highScore >= 100 && highScore <= 500) {
			position = 3;
		}
		
		return position;
	}
}
