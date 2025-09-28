package day7;

import java.util.List;
import java.util.Scanner;

public class DeliveryController {

	Scanner sc = new Scanner(System.in);
	
	private DeliveryService service;
	
	public DeliveryController(DeliveryService service) {
		this.service = service;
	}



	public void run() {
		
		while (true) {
			System.out.println("번호 입력: 1-상품등록 | 2-전체조회 | 3-개별조회 | 4-상품삭제 | 5-상품수정 | 6-통계 | 0-종료");
			int q = sc.nextInt();
			sc.nextLine();
			
			switch (q) {
			case 1: addProduct(); break;
			case 2: outAllProduct(); break;
			case 3: outProductById(); break;
			case 4: deleteProduct(); break;
			case 5: updateProduct(); break;
			case 6: outReport(); break;
			case 0: System.out.println("프로그램을 종료합니다."); return; 
			default: System.out.println("정해진 숫자를 입력하세요.");
			}
			
		}
			
	}


	// case1. Register Product
	// case1. 상품등록
	private void addProduct() {
		System.out.println("품명: ");
		String name = sc.nextLine();
		System.out.println("가격: ");
		int price = sc.nextInt();
		System.out.println("수량: ");
		int stock = sc.nextInt();
		
		service.saveAllItems(name, price, stock);
		System.out.println("등록 완료");
		
	}


	// case2. View All Products
	// case2. 전체조회
	private void outAllProduct() {
		List<DeliveryDTO> list = service.getAllProduct();
		
		if (list.isEmpty()) {
			System.out.println("저장된 데이터가 없습니다.");
		} else {
			for (DeliveryDTO dto : list) {
				System.out.println(dto);
			}
		}
		
	}


	// case3. View Product by ID
	// case3. 개별조회
	private void outProductById() {
		System.out.println("조회할 상품 번호: ");
		int id = sc.nextInt();
		
		DeliveryDTO dto = service.getProductById(id);
		if (dto == null) {
			System.out.println("해당 번호가 없습니다.");
		}else {
			System.out.println(dto);
		}
		
	}


	// case4. Delete Product
	// case4. 삭제
	private void deleteProduct() {
		System.out.println("삭제할 아이템 번호: ");
		int id = sc.nextInt();
		
		if (service.removeItem(id)) {
			System.out.println("삭제되었습니다.");
		} else {
			System.out.println("해당 번호가 없습니다.");
		}
		
	}


	// case5. Update Product
	// case5. 수정
	private void updateProduct() {
		System.out.println("수정할 상품 번호: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		DeliveryDTO dto = service.getProductById(id);
		if (dto == null) {
			System.out.println("해당 번호가 없습니다.");
		} 
		
		System.out.println("변경 상품명(" + dto.getName() + "): ");
		String newName = sc.nextLine();
		System.out.println("변경 가격(" + dto.getPrice() + "): ");
		int newPrice = sc.nextInt();
		System.out.println("변경 수량(" + dto.getStock() + "): ");
		int newStock = sc.nextInt();
		
		
		if (service.editItems(id, newName, newStock, newPrice)) {
			System.out.println("정보가 수정되었습니다.");
		} else {
			System.out.println("수정을 실패하였습니다.");
		}
		
	}


	// case6. Statistics
	// case6. 통계
	private void outReport() {
		int sum = service.getSumTotal();
		int cnt = service.getItemsSnt();
		System.out.printf("합계: %,d원, 수량: %d개\n",sum, cnt);
		
	}
	
	
}
