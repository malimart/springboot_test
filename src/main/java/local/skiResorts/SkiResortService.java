package local.skiResorts;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkiResortService {
	
	@Autowired
	SkiResortRepository skiResortRepo;

	public List<SkiResort> getAllSkiResorts() {
		return skiResortRepo.findAll();
	}
	
	public Optional<SkiResort> getSkiResortById(int id) {
		return skiResortRepo.findById(Integer.valueOf(id));
	}
	
	public List<SkiResort> getSkiResortByCountryId(int id) {
		return skiResortRepo.findByCountryId(id);
	}
	
	public List<SkiResort> getSkiResortByName(String name) {
		return skiResortRepo.getByName(name);
	}
	
	public String createSkiResort(SkiResort skiResort) {
		try {
			skiResortRepo.save(skiResort);
			return "Ski resort " + skiResort.getName() + " has been successfully created.";
		} catch (Exception e) {
			e.printStackTrace();
			return "ERROR! Country could not be created.";
		}
	}

	public String deleteSkiResortById(int id) {
		try {
			skiResortRepo.deleteById(Integer.valueOf(id));
			return "Ski resort with id " + id + " has been deleted.";
		} catch (Exception e) {
			e.printStackTrace();
			return "No ski resort with id " + id + " has been found";
		}		
	}

	public String updateSkiResort(SkiResort skiResort) {
		try {
			skiResortRepo.save(skiResort);
			return "Ski resort " + skiResort.getName() + " has been successfully updated.";
		} catch (Exception e) {
			e.printStackTrace();
			return "ERROR! Ski resort could not be updated.";
		}
	}

}
