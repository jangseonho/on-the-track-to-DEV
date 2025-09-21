package day6Ingredient;

import java.util.ArrayList;
import java.util.List;

public class IngredientDAO {

private List<IngredientDTO> ingredientList = new ArrayList<>();
	
	
	public void save(IngredientDTO dto) {
		ingredientList.add(dto);
	}
	
	// 회원 리스트 조회를 위해 전체 목록 가져옴  (-> 반환)
	public List<IngredientDTO> findAll() {
		return ingredientList; //findAll() 이 메서드로 나를 호출한 곳으로 회원정보 전체를 호출한 곳으로 반환
	}
	
	
	
}
