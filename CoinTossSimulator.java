package coinTossSimulator;

public class CoinTossSimulator {
	public void tossSimulation (Coin coin) {
		int countHead = 0, countTail = 0;
		for (int i = 1; i <= 20; i++){
			coin.toss();
			System.out.printf(i + ". Side up: " + coin.getSideUp() + " \n");
			if (coin.getSideUp() == "Head")
				countHead++;
			else
				countTail++;
		}
		
	}

	public static void main(String[] args) {
		CoinTossSimulator newCoin = new CoinTossSimulator();
		Coin coin = new Coin();
		
		System.out.printf("Initial side up: " + coin.getSideUp() + " \n");
		
		newCoin.tossSimulation(coin);

	}

}

