package day7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class DeliveryDAO {

	// Field
	private String filename;
	private List<DeliveryDTO> itemList;
	
	// Constructor
	public DeliveryDAO(String filename) {
		this.filename = filename;
		this.itemList = loadCsv(filename);
	}

	private List<DeliveryDTO> loadCsv(String filename2) {
		
		List<DeliveryDTO> list = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(filename))){
			String line;
			boolean skip = true;
			
			while ((line = br.readLine()) != null) {
				
				if (skip) {
					skip = false;
					continue;
				}
				
				String[] part = line.split(",");
				
				int id = Integer.parseInt(part[0].trim());
				String name = part[1].trim();
				int price = Integer.parseInt(part[2].trim());
				int stock = Integer.parseInt(part[3].trim());
				
				list.add(new DeliveryDTO(id, name, price, stock));
				
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("csv 없음" + e.getMessage());
		} catch (Exception e) {
			System.out.println("기타 오류" + e.getMessage());
		}
		
		return list;
	}

	// case1. 상품추가
	public void save(DeliveryDTO dto) {
		itemList.add(dto);
		writeCsv();
	}
	
	private void writeCsv() {
		try (PrintWriter pw = new PrintWriter(new FileWriter(filename))) {
			
			pw.println("id,name,price,stock");
			
			for (DeliveryDTO dto : itemList) {
				pw.printf("%d,%s,%d,%d/n", dto.getId(), dto.getName(), dto.getPrice(), dto.getStock());
			}
			
		} catch (Exception e) {
			System.out.println("csv 저장 실패" + e.getMessage());
		}
		
	}

	// case2. View All Products
	// case2. 전체조회
	public List<DeliveryDTO> findAll() {
		return itemList;
	}

	// case3. View Product by ID
	// case3. 개별조회
	public DeliveryDTO findById(int id) {
		for (DeliveryDTO dto : itemList) {
			if(dto.getId() == id) return dto;
		}
		return null;
	}

	// case4. Delete Product
	// case4. 삭제
	public boolean deleteById(int id) {
		for (int i = 0; i < itemList.size(); i++) {
			if (itemList.get(i).getId() == id) {
				itemList.remove(i);
				return true;
			}
		}
		return false;
	}

	// case5. Update Product
	// case5. 수정
	public boolean updateProduct(int id, String newName, int newStock, int newPrice) {
		DeliveryDTO dto = findById(id);
		if (dto != null) {
			dto.setName(newName);
			dto.setStock(newStock);
			dto.setPrice(newPrice);
			return true;
		}
		return false;
	}

	// case6. Statistics
	// case6. 통계
	public int count() {
		return itemList.size();
	}
	
	
}
