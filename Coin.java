package coinTossSimulator;
import java.util.Random;

public class Coin {
		private String sideUp;
		
		// Default constructor
		
		public Coin () {
			toss();
		}

		public String getSideUp() {
			return sideUp;
		}
		
		public void setSideUp(String SideUp) {
			this.sideUp = SideUp;
		}
		
		public void toss() {
			Random ranNum = new Random();
			int rand = ranNum.nextInt(2);	// Generate an integer random number between 1 and 0 
			
			if (rand == 0) {
				this.setSideUp("Tail");
			}
			else {
				this.setSideUp("Head");
			}
		}
}
	
