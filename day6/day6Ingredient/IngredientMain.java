package day6Ingredient;

public class IngredientMain {

	public static void main(String[] args) {
		IngredientDAO dao = new IngredientDAO();
		IngredientService service = new IngredientService(dao);
		IngredientController controller = new IngredientController(service);
		controller.run();

	}

}
