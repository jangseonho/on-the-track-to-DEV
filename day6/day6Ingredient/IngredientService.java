package day6Ingredient;

import java.util.List;

public class IngredientService {

	private IngredientDAO dao;

	public IngredientService(IngredientDAO dao) {
		this.dao = dao;
	}
	
	public List<IngredientDTO> getAllIngredient() {
		return dao.findAll();
	}
	
	public void addIngredient(int number, String name, int quantity, String day) {
		IngredientDTO dto = new IngredientDTO(number, name, quantity, day);
		dao.save(dto);
	}
	
	
	
	
}
