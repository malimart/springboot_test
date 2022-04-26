package local.countries;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="country", schema="public")
public class Country {
	@Id
	private int id;
	private String name;
	private int population;
	private String description;
	
	public Country() {
	}

	public Country(int id, String name, int population, String description) {
		this.id = id;
		this.name = name;
		this.population = population;
		this.description = description;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPopulation() {
		return population;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPopulation(int population) {
		this.population = population;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}
