package day6Animal;

import java.util.List;
import java.util.Scanner;

public class AnimalController {

	Scanner sc = new Scanner(System.in);
	
	private AnimalService service;

	public AnimalController(AnimalService service) {
		this.service = service;
	}
	
	public void run() {
		
		while (true) {
			System.out.println("번호입력: 1-동물정보등록, 2-동물정보조회, 0-프로그램 종료");
			int n = sc.nextInt();
			sc.nextLine();
			
			switch (n) {
			case 1:
				System.out.println("아이디: ");
				String id = sc.nextLine();
				System.out.println("보호자명: ");
				String owner = sc.nextLine();
				System.out.println("반려동물명: ");
				String pet = sc.nextLine();
				System.out.println("반려동물 나이: ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.println("연락처: ");
				String phone = sc.nextLine();
				
				service.addAnimal(id, owner, pet, age, phone);
				System.out.println("동물 등록 완료");
				break;
			case 2:
				showAnimal();
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("숫자만 입력하세요");
			}
			
			
			
		}
		
		
	}
	
	void showAnimal() {
		List<AnimalDTO> animal = service.getAllAnimal();
		
		for(AnimalDTO dto: animal) {
			System.out.println(dto);
		}
	}
	
	
}
