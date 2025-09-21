package day6Health;

public class HealthDTO {

	private String name;
	private String number;
	private int standard;
	private int consumed;
	
	public HealthDTO() {}
	
	public HealthDTO(String name, String number, int standard, int consumed) {
		this.name = name;
		this.number = number;
		this.standard = standard;
		this.consumed = consumed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	public int getConsumed() {
		return consumed;
	}

	public void setConsumed(int consumed) {
		this.consumed = consumed;
	}

	@Override
	public String toString() {
		return "HealthDTO [name=" + name + ", number=" + number + ", standard=" + standard + ", consumed=" + consumed
				+ "]";
	}
	
	
}
