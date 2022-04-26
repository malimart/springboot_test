package local.slopes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SlopeService {
	
	@Autowired
	SlopeRepository slopeRepo;
	
	public List<Slope> getAllSlopes() {
		return slopeRepo.findAll();
	}
	
	public Optional<Slope> getSlopeById(int id) {
		return slopeRepo.findById(id);
	}
	
	public List<Slope> getSlopeBySkiResortId(int id) {
		return slopeRepo.findBySkiResortId(id);
	}
	
	public List<Slope> getSlopeByName(String name) {
		return slopeRepo.getByName(name);
	}
	
	public List<Slope> findSlopeByName (String name) {
		return slopeRepo.findByName(name);
	}
	
	public String createSlope(Slope slope) {
		try {
			slopeRepo.save(slope);
			return "Slope " + slope.getName() + " has been successfully created!";
		} catch (Exception e) {
			e.printStackTrace();
			return "ERROR! Slope could not be created.";
		}
	}
	
	public String deleteSlopeById(int id) {
		try {
			slopeRepo.deleteById(id);
			return "Slope with id: " + id + " has been deleted.";
		} catch (Exception e) {
			e.printStackTrace();
			return "No slope with id: " + id + " has been found.";
		}
	}
	
	public String updateSlope(Slope slope) {
		try {
			slopeRepo.save(slope);
			return "Slope " + slope.getName() + " has been successfully updated!";
		} catch (Exception e) {
			e.printStackTrace();
			return "ERROR! Slope could not be created.";
		}
	}
}
