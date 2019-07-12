
public class SimpleDotComTestDriver {

	public static void main(String[] args) {
		
		int numOfGuesses = 0;
		
		GameHelper helper = new GameHelper();
		
		SimpleDotCom theDotCom = new SimpleDotCom();
		
		int randomNum = (int) (Math.random() * 5);
		
		int[] locations = {randomNum, randomNum+1, randomNum+2};
		
		theDotCom.setLocationCells(locations);
		
		boolean isLive = true;
		
		while (isLive == true) {
			
			String guess = helper.getUserInput("Insira um número");
			
			String result = theDotCom.checkYourself(guess);
			
			numOfGuesses++;
			
			if (result.equals("kill")) {
				
				isLive = false; 
				
				System.out.println("Você usou " + numOfGuesses + " palpites");
			}
		}

	}

}
