package day5village;

public class PersonMain {

	public static void main(String[] args) {
		Person person1 = new Person("김세영", 26);
		Person person2 = new Person("허수현", 25);
		Person person3 = new Person("권소령", 24);
		Person person4 = new Person("전수현", 24);
		Person person5 = new Person("이채연", 24);
		
		System.out.println("이름: " + person1.getName() + ", 나이: " + person1.getAge());
		System.out.println("이름: " + person2.getName() + ", 나이: " + person2.getAge());
		System.out.println("이름: " + person3.getName() + ", 나이: " + person3.getAge());
		System.out.println("이름: " + person4.getName() + ", 나이: " + person4.getAge());
		System.out.println("이름: " + person5.getName() + ", 나이: " + person5.getAge());
		
		
	}

}
