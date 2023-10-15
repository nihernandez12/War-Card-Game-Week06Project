package Week06Project;

import java.util.ArrayList;
import java.util.List;

public class Player {

	 int score;
	 List<Card> hand = new ArrayList<Card>();
	 String playerName;

	
	public Player(String playerName) {
				score = 0;
				this.playerName = playerName;
	}
	//prints out player info.
	public void describe() {
		System.out.println("Player: " + playerName + "\nScore: " + score);
		for(Card card: hand) {
			card.describe();
		}
	}
	

	
	// flip- draws the top card of the deck and gives to the player's hand
	public Card flip() {
		return hand.remove(0);
	}
	//takes a deck as an arguement and calls the draw method on the deck, adding the returned card to the hand field
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	//adds 1 to player's score field
	public void incrementScore() {
		score++;
	}
	
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	public List<Card> getHand() {
		return hand;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public Integer getScore() {
		return score;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerName() {
		return playerName;
	}
	
}
