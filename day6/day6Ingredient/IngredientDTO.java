package day6Ingredient;

public class IngredientDTO {

	private int number;
	private String name;
	private int quantity;
	private String day;
	
	public IngredientDTO() {}
	
	public IngredientDTO(int number, String name, int quantity, String day) {
		this.number = number;
		this.name = name;
		this.quantity = quantity;
		this.day = day;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "IngredientDTO [number=" + number + ", name=" + name + ", quantity=" + quantity + ", day=" + day + "]";
	}
	
}
