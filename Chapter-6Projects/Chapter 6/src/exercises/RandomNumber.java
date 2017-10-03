package exercises;

import javax.swing.JOptionPane;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			displayRunGame();
			
		}
		public static void displayRunGame()
		{
			
		int guess = 0;
		int result;
		String resultString;
		String msg;
		int low = 1;
		int high = 100;
		
		int score = 10;
		result = low + (int)(Math.random() * high);
		do {
		resultString = JOptionPane.showInputDialog(null, "Try to guess my number between" + low + " and " + high);
		result= Integer.parseInt(resultString);
		score--;
		if(guess==result)
		{
			msg = "You Win!!!";
		}
		else
			if(guess<result)
			{
				msg = "Your Guess was too low";
				
			}
			else
				msg = "Your Guess was too high";
		5
		JOptionPane.showMessageDialog(null, msg + " Your Score was" + score);
		}while(guess != result);
}
}



		
		
		
	


