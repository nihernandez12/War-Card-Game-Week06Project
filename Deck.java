package Week06Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Deck {
private static List<Card> cards = new ArrayList<Card>();

	public Deck() {
		
		Map<Integer, String> cardValues = new HashMap<Integer, String>();
		cardValues.put(2,  "Two");
		cardValues.put(3,  "Three");
		cardValues.put(4,  "Four");
		cardValues.put(5,  "Five");
		cardValues.put(6,  "Six");
		cardValues.put(7,  "Seven");
		cardValues.put(8,  "Eight");
		cardValues.put(9,  "Nine");
		cardValues.put(10,  "Ten");
		cardValues.put(11,  "Jack");
		cardValues.put(12,  "Queen");
		cardValues.put(13,  "King");
		cardValues.put(14,  "Ace");

		
		
		
		List<String> suites = new ArrayList<String>();
		suites.add("Hearts");
		suites.add("Spades");
		suites.add("Diamond");
		suites.add("Clover");
		
		String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};

		
		for(String suite : suites) {
			int value = 2;
		for(String name : names) {
			Card card = new Card();
			card.setName(name + " of " + suite);
			card.setValue(value++);
			cards.add(card);
		}
		}
		
		
	}
	public static void shuffle() {
		Collections.shuffle(cards);
	}
	public Card draw() {
		return cards.remove(0);
		
	}
}



