package day5Library;

public class BookMain {

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.setTitle("To Have or To Be");
		book1.setAuthor("Erich Fromm");
		book1.setPrice(12510);
		System.out.println("Title: " + book1.getTitle() + ", Author: " + book1.getAuthor() + ", Price: " + book1.getPrice());
		
		TextBook tb = new TextBook();
		tb.setTitle("자바의 정석");
		tb.setAuthor("남궁성");
		tb.setPrice(40000);
		tb.setSubject("컴퓨터공학");
		System.out.println("Title: " + tb.getTitle() + ", Author: " + tb.getAuthor() + ", Price: " + tb.getPrice() + ", Subject: " + tb.getSubject());
	
		Novel novel = new Novel();
		novel.setTitle("人間失格");
		novel.setAuthor("太宰 治");
		novel.setPrice(9000);
		novel.setGenre("小説");
		System.out.println("Title: " + novel.getTitle() + ", Author: " + novel.getAuthor() + ", Price: " + novel.getPrice() + ", Genre: " + novel.getGenre());
		
	
	}
	
}
