package gameProject;

public class Campaign {
	private String name;
	private double discount;
	public Campaign(String name, double discount) {		
		this.name = name;
		this.discount = discount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
