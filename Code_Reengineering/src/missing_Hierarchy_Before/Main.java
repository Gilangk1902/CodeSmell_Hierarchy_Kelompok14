package missing_Hierarchy_Before;

public class Main {
	
	Foe foe;
	Player player;
	Actions action;
	
	public static void main(String[] args) {
		
	}
	
	public void Instantiate() {
		foe = new Foe(100);
		player = new Player(100);
		action = new Actions();
		
		
	}
	
	
	
	public void Game() {
		do {
			int input;
		}while(player.hp>0);
	}

}
