
package day5Password;

public class PasswordMain {

	public static void main(String[] args) {
		PasswordData data = new PasswordData();
		
		data.setPassword("abc123");
		System.out.println("내 비밀번호는 " + data.getPassword());
	}

}
