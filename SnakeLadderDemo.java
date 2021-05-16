
public class SnakeLadderDemo {
	static final int noPlay = 0;
	static final int ladder = 1;
	static final int snake = 2;
	static int playerPosition = 0;
	int winPosition=100;
	int option;
	int rollDie;
	public void dice() {
		for(playerPosition=0; playerPosition < 100; playerPosition++) {
			option = (int) ((Math.random()*10)%3);
			rollDie = (int) (Math.floor(Math.random()*(6)+1));

			switch(option) {
			case noPlay: 
				playerPosition = 0;
				break;
			case ladder:
				playerPosition += rollDie;
				break;
			case snake:
				playerPosition -= rollDie;
				break;
			}	
		}
		System.out.println("Player position is: "+playerPosition);
	}
	
	public static void main(String[] args) {
		SnakeLadderDemo s = new SnakeLadderDemo();
		System.out.println(playerPosition);
		if(playerPosition > 100) {	
			s.dice();
			}else if(playerPosition == 100){
				s.dice();
			}else {
				s.dice();
			}
				


	}
}
