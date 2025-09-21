package day6Animal;

public class AnimalDTO {

	private String id;
	private String owner;
	private String pet;
	private int	age;
	private String phone;
	
	public AnimalDTO() {}

	public AnimalDTO(String id, String owner, String pet, int age, String phone) {
		this.id = id;
		this.owner = owner;
		this.pet = pet;
		this.age = age;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPet() {
		return pet;
	}

	public void setPet(String pet) {
		this.pet = pet;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "AnimalDTO [id=" + id + ", owner=" + owner + ", pet=" + pet + ", age=" + age + ", phone=" + phone + "]";
	}
	
	
	
	
	
	
	
}
