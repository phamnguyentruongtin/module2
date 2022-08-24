package projectmodule2.ss8;


public class TennisGame {

    public static String getScore(String playerName1, String playerName2, int mScore1, int mScore2) {

        String Score = "";
        int tempScore = 0;

        if (mScore1 == mScore2) {
            switch (mScore1) {
                case 0:
                    Score = "Love-All";
                    break;
                case 1:
                    Score = "Fifteen-All";
                    break;
                case 2:
                    Score = "Thirty-All";
                    break;
                case 3:
                    Score = "Forty-All";
                    break;
                default:
                    Score = "Deuce";
                    break;

            }

        } else if (mScore1 >= 4 || mScore2 >= 4) {
            int minusResult = mScore1 - mScore2;
            if (minusResult == 1) Score = "Advantage player1";
            else if (minusResult == -1) Score = "Advantage player2";
            else if (minusResult >= 2) Score = "Win for player1";
            else Score = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = mScore1;
                else {
                    Score += "-";
                    tempScore = mScore2;
                }
                switch (tempScore) {
                    case 0:
                        Score += "Love";
                        break;
                    case 1:
                        Score += "Fifteen";
                        break;
                    case 2:
                        Score += "Thirty";
                        break;
                    case 3:
                        Score += "Forty";
                        break;
                }
            }
        }

        return Score;
    }

    public static void main(String[] args) {
        getScore("john","kevil",40,0);
    }
}
