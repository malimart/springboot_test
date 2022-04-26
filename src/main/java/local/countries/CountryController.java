package local.countries;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
	@Autowired
	CountryService countryService;
	
	public CountryController() {
	}

	@CrossOrigin(origins = "*")
	@RequestMapping("/getAllCountries")
	public List<Country> getAllCountries() {
		return countryService.getAllCountries();
	}
	
	@GetMapping("/getCountryById/{id}")
	public Optional<Country> getCountryById(@PathVariable int id) {
		return countryService.getCountryById(id);
	}
	
	@RequestMapping(value = "/createCountry", method = RequestMethod.POST)
	public String createCountry(@RequestBody Country country) {
		return countryService.createCountry(country);
	}
	
	@DeleteMapping("/deleteCountryById/{id}")
	public String deleteCountryById(@PathVariable int id) {
		return countryService.deleteCountryById(id);
	}
	
	@PutMapping("/updateCountry/{id}")
	public String updateCountry(@RequestBody Country country, @PathVariable int id) {
		return countryService.updateCountry(country);
	}
}
