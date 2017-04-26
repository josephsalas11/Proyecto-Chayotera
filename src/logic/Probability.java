package logic;

public class Probability {
	
	 private int number;
	
	public void proba()
	{
		  int random= (int) (Math.random() * 100 + 1);
	       
	        if (random > 90) {
	            number = 3;
	        } else if (random > 70 && random <= 90) {
	            number=2;
	        } else if (random <= 70) {
	            number=1;
	        }
	}

}
