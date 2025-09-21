package day6Health;

import java.util.List;
import java.util.Scanner;

public class HealthController {

Scanner sc = new Scanner(System.in);
	
	private HealthService service;

	public HealthController(HealthService service) {
		this.service = service;
	}
	
	public void run() {
		
		while(true) {
			System.out.println("번호입력:1-회원입력, 2-회원출력, 0-프로그램 종료");
			int q = sc.nextInt();  
			sc.nextLine(); 
			
			switch (q) {
				case 1:
					System.out.println("회원명: ");
					String name = sc.nextLine();
					System.out.println("회원번호: ");
					String number = sc.nextLine();
					System.out.println("기준칼로리: ");
					int standard = sc.nextInt();
					System.out.println("소비칼로리: ");
					int consumed = sc.nextInt();
					
					service.addHealth(name, number, standard, consumed);
					System.out.println("회원 등록");
					break;
					
				case 2:
					showHealth();
					break;
				case 0:
					System.out.println("프로그램 종료");
					return; 
				default:
					System.out.println("숫자만 입력하세요");
			}
		}
		
	}
	
	void showHealth() {
		List<HealthDTO> health = service.getAllHealth();
		
	
		for(HealthDTO dto : health) {
			System.out.println(dto);
		}
	}
	
	
}
