package Week06Project;

public class Card {
	private String name;
	private int value;
	
	public Card(String name, int value) {
		this.name = name;
		this.value = value;
		
	}
	public Card() {
		
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

	public void describe() {
		System.out.println(this.value + " of " +this.name);
	}
}
