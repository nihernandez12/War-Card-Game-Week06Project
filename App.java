package Week06Project;

public class App {

	public static void main(String[] args) {
	
		// have two players and use the shuffle method on the deck of cards
		Deck deck = new Deck();
		Player p1 = new Player ("Nicole");
		Player p2 = new Player("Cesar");
		Deck.shuffle();
		
		//use a for loop to iterate 52 times, calling the draw method on the other player each iteration
		
		for(int i = 0 ; i < 52; i++) {
			if(i % 2 ==0)
				p1.draw(deck);
		
		 else {
			p2.draw(deck);
		}
		}
	
		// use a for loop to iterate 26 times, calling the flip method for each player
		for(int i = 0; i < 26; i++) {
			Card x = p1.flip();
			Card y = p2.flip();
			System.out.println(p1.getPlayerName()+ " played " + x.getName());
			System.out.println(p2.getPlayerName()+ " played " + y.getName());
			
			
		
			//Compare the value of each card returned by the two player's flip methods. Call the increment Score method on the player whose card is higher value
		int first = x.getValue();
		int second = y.getValue();
			if(first < second) {
			p2.incrementScore();
			System.out.println(p2.getPlayerName() + " gets a point!");
		}
		else if(first > second) {
				p1.incrementScore();
				System.out.println(p1.getPlayerName() + " gets a point!");
			} else { 
				System.out.println("No points! It's a tie!");
			}
			System.out.println("The score is now " + p1.getPlayerName() + " = " + p1.getScore()+ " versus " + p2.getPlayerName()+ " = " + p2.getScore());
	
			
			System.out.println("-------------------------------");
		}
		//Displays scores of each player
		p1.getScore();
		p2.getScore();
		System.out.println(p1.getPlayerName() + "'s final score is " + p1.getScore() );
		System.out.println(p2.getPlayerName() + "'s final score is " + p2.getScore() );
		
		
	//Winner based on final score
		
		
		if(p1.getScore() < p2.getScore()) {
			System.out.println("Player 2 " + p2.getPlayerName() +" wins the game!");
		}
		else if(p1.getScore() > p2.getScore()) {
			System.out.println("Player 1 " + p1.getPlayerName() + " wins the game!");
		}
		else {
				System.out.println("Draw");
		
		}
		
	}
		
	
}

	


