package day7;

import java.util.List;

public class DeliveryService {

	private DeliveryDAO dao;
	private int nextId;
	
	public DeliveryService(DeliveryDAO dao) {
		this.dao = dao;
		this.nextId = getId() + 1;
	}
	
	// case1. Register Product
	// case1. 상품등록
	private int getId() {
		int max = 0;
		for(DeliveryDTO dto : dao.findAll()) {
			if(dto.getId() > max){
				max = dto.getId();
			}
		}
		return max;
	}
	
	public void saveAllItems(String name, int price, int stock) {
		DeliveryDTO dto = new DeliveryDTO(nextId++, name, price, stock);
		dao.save(dto);
	}

	// case2. View All Products
	// case2. 전체조회
	public List<DeliveryDTO> getAllProduct() {
		return dao.findAll();
	}

	// case3. View Product by ID
	// case3. 개별조회
	public DeliveryDTO getProductById(int id) {
		return dao.findById(id);
	}

	
	// case4. Delete Product
	// case4. 삭제
	public boolean removeItem(int id) {
		return dao.deleteById(id);
	}

	// case5. Update Product
	// case5. 수정
	public boolean editItems(int id, String newName, int newStock, int newPrice) {
		return dao.updateProduct(id, newName, newStock, newPrice);
	}

	
	// case6. Statistics
	// case6. 통계
	public int getSumTotal() {
		int sum = 0;
		
		for(DeliveryDTO dto : getAllProduct()) {
			sum += dto.getTotal();
		}
		return sum;
	}

	public int getItemsSnt() {
		return dao.count();
	}

	

}
