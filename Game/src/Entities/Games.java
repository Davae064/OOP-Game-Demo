package Entities;

public class Games {

	private int id;
	private String name;
	private double price;
	private String explanation;
	
	public Games(int id, String name, double price, String explanation) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.explanation = explanation;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
}
