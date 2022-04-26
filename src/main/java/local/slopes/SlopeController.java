package local.slopes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SlopeController {
	@Autowired
	SlopeService slopeService;

	public SlopeController() {
		super();
	}
	
	@GetMapping("/getAllSlopes")
	public List<Slope> getAllSlopes() {
		return slopeService.getAllSlopes();
	}
	
	@GetMapping("/getSlopeById/{id}")
	public Optional<Slope> getSlopeById(@PathVariable int id) {
		return slopeService.getSlopeById(id);
	}
	
	@GetMapping("/getSlopesBySkiResortId/{id}")
	public List<Slope> getSlopesBySkiResortId(@PathVariable int id) {
		return slopeService.getSlopeBySkiResortId(id);
	}
	
	@GetMapping("/getSlopesByName/{name}")
	public List<Slope> getSlopesByName(@PathVariable String name) {
		return slopeService.getSlopeByName(name);
	}
	
	@GetMapping("/findSlopesByName/{name}")
	public List<Slope> findSlopesByName(@PathVariable String name) {
		return slopeService.findSlopeByName(name);
	}
	
	@PostMapping("/createSlope")
	public String createSlope(@RequestBody Slope slope) {
		return slopeService.createSlope(slope);
	}
	
	@DeleteMapping("/deleteSlopeById/{id}")
	public String deleteSlopeById(@PathVariable int id) {
		return slopeService.deleteSlopeById(id);
	}
	
	@PutMapping("/updateSlope")
	public String updateSlope(@RequestBody Slope slope) {
		return slopeService.updateSlope(slope);
	}
	
}
