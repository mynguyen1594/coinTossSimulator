package coinTossSimulator;

public class CoinTossSimulator {
	public void tossSimulation (Coin coin) {
		int countHead = 0, countTail = 0;
		for (int i = 1; i <= 20; i++) {		// toss the coin for 20 times
			coin.toss();
			System.out.printf(i + ". Side up: " + coin.getSideUp() + " \n");	// Display the side up
			
			if (coin.getSideUp() == "Head")
				countHead++;	// Count the head's appearance
			else
				countTail++;	// Count the tail's appearance 
		}
		System.out.printf("Number of heads: " + countHead + "\n");
		System.out.printf("Number of tails: " + countTail + "\n");
	}

	public static void main(String[] args) {
		CoinTossSimulator newCoin = new CoinTossSimulator();	// Create a CoinTossSimulator object
		Coin coin = new Coin();									// Create a Coin object 
		
		System.out.printf("Initial side up: " + coin.getSideUp() + " \n");
		
		newCoin.tossSimulation(coin);
	}
}

