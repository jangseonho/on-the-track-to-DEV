package day6Ingredient;

import java.util.List;
import java.util.Scanner;

public class IngredientController {

Scanner sc = new Scanner(System.in);
	
	private IngredientService service;

	public IngredientController(IngredientService service) {
		this.service = service;
	}
	
	public void run() {
		
		while(true) {
			System.out.println("번호입력:1-식자재입력, 2-식자재출력, 0-프로그램 종료");
			int q = sc.nextInt(); // 90\n 
			sc.nextLine(); // 숫자 입력 후 남아있는 엔터값(\n)을 바로 읽어서 버림. 버퍼 정리
			
			switch (q) {
				case 1:
					System.out.println("식자재번호: ");
					int number = sc.nextInt();
					sc.nextLine();
					System.out.println("식자재명: ");
					String name = sc.nextLine();
					System.out.println("수량: ");
					int quantity = sc.nextInt();
					sc.nextLine();
					System.out.println("등록날짜: ");
					String day = sc.nextLine();
					
					service.addIngredient(number, name, quantity, day);
					System.out.println("식자재 등록");
					break;
					
				case 2:
					showIngredient();
					break;
				case 0:
					System.out.println("프로그램 종료");
					return; 
				default:
					System.out.println("숫자만 입력하세요");
			}
		}
		
	}
	
	void showIngredient() {
		List<IngredientDTO> ingredient = service.getAllIngredient();
		
	
		for(IngredientDTO dto : ingredient) {
			System.out.println(dto);
		}
	}
	
	
	
	
	
	
	
}
