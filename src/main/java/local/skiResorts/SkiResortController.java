package local.skiResorts;

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
public class SkiResortController {
	@Autowired
	SkiResortService skiResortService;
	
	public SkiResortController() {
	}
	
	@GetMapping("/getAllSkiResorts")
	public List<SkiResort> getAllSkiResorts() {
		return skiResortService.getAllSkiResorts();
	}
	
	@GetMapping("/getSkiResortById/{id}")
	public Optional<SkiResort> getSkiResortById(@PathVariable int id) {
		return skiResortService.getSkiResortById(id);
	}
	
	@GetMapping("/getSkiResortByName/{name}")
	public List<SkiResort> getSkiResortByName(@PathVariable String name) {
		return skiResortService.getSkiResortByName(name);
	}
	
	@GetMapping("/getSkiResortByCountryId/{id}")
	public List<SkiResort> getSkiResortByCountryId(@PathVariable int id) {
		return skiResortService.getSkiResortByCountryId(id);
	}
	
	@PostMapping("/createSkiResort")
	public String createSkiResort(@RequestBody SkiResort skiResort) {
		return skiResortService.createSkiResort(skiResort);
	}
	
	@DeleteMapping("/deleteSkiResortById/{id}")
	public String deleteSkiResortById(@PathVariable int id) {
		return skiResortService.deleteSkiResortById(id);
	}
	
	@PutMapping("/updateSkiResort")
	public String updateSkiResort(@RequestBody SkiResort skiResort) {
		return skiResortService.updateSkiResort(skiResort);
	}
}
