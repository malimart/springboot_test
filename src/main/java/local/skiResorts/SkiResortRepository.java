package local.skiResorts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SkiResortRepository extends JpaRepository<SkiResort, Integer>{
	public List<SkiResort> findByName(String name);
	
	// dodaj spodnjo metodo:
	// public List<SkiResort> findByNoOfSlopesLessThan(Integer i);
		
	// ?1 predstavlja prvi parameter
	@Query("from SkiResort where name=?1")
	public List<SkiResort> getByName(String name);
	
	public List<SkiResort> findByCountryId(Integer id);
	
}
