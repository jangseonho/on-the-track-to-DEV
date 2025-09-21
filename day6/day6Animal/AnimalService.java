package day6Animal;

import java.util.List;

public class AnimalService {

	private AnimalDAO dao;

	public AnimalService(AnimalDAO dao) {
		this.dao = dao;
	}
	
	public List<AnimalDTO> getAllAnimal(){
		return dao.findAll();
	}
	
	public void addAnimal(String id, String owner, String pet, int age, String phone) {
		AnimalDTO dto = new AnimalDTO(id, owner, pet, age, phone);
		dao.save(dto);
	}
	
	
}
