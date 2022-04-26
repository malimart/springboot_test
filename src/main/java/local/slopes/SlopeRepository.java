package local.slopes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SlopeRepository extends JpaRepository<Slope, Integer>{
	
	public List<Slope> findByName(String name);
	
	@Query("FROM Slope WHERE name = ?1")
	public List<Slope> getByName(String name);
	
	public List<Slope> findBySkiResortId(int id);
}
