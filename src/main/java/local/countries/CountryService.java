package local.countries;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

	@Autowired
	CountryRepository countryRepo;

	public CountryService() {
	}

	public List<Country> getAllCountries() {
		return countryRepo.findAll();
	}

	public Optional<Country> getCountryById(int id) {
		return countryRepo.findById(Integer.valueOf(id));
	}

	public String createCountry(Country country) {
		try {
			if(countryRepo.findById(Integer.valueOf(country.getId())).equals(Optional.empty())) {
				countryRepo.save(country);
			} else {
				return "Country with this ID already exists.";				
			}			
		} catch (Exception e) {
			e.printStackTrace();
			return "Country could not be created";
		}
		return "Country created successfully";
	}
	
	public String deleteCountryById(int id) {
		try {
			countryRepo.deleteById(Integer.valueOf(id));
		} catch (Exception e) {
			e.printStackTrace();
			return "Country with id:" + id + " not found.";
		}
		return "Country deleted successfully";
	}

	public String updateCountry(Country country) {
		try {
			countryRepo.save(country);
		} catch (Exception e) {
			e.printStackTrace();
			return "Country could not be updated";
		}
		return "Country updated successfully";
	}
}
