package day6Health;

import java.util.List;

public class HealthService {

	private HealthDAO dao;

	public HealthService(HealthDAO dao) {
		this.dao = dao;
	}
	
	
	public List<HealthDTO> getAllHealth() {
		return dao.findAll();
	}
	
	
	public void addHealth(String name, String number, int standard, int consumed) {
		HealthDTO dto = new HealthDTO(name, number, standard, consumed);
		dao.save(dto);
	}
	
	
	
}
