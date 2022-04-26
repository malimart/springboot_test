package local.skiResorts;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import local.countries.Country;

@Entity
@Table(name="skiresort", schema="public")
public class SkiResort {
	@Id
	private int id;
	private String name;
	private int noOfLifts;
	private int noOfSlopes;
	// Polje Country bo tuji kljuc. Ta kljuc lahko vsebuje samo drzave, ki so ze v tabeli Country.
	// V eni drzavi je lahko vec smucisc.
	// Tudi v razred Country bi lahko dodali polje SkiResort, vendar bi potrem uporabili @OneToMany, kar oznacuje, da je tabela Country tista, ki "daje" drugi tabeli tuji kljuc.
	@ManyToOne
	private Country country;

	public SkiResort(int id, String name, int noOfLifts, int noOfSlopes, Country country) {
		super();
		this.id = id;
		this.name = name;
		this.noOfLifts = noOfLifts;
		this.noOfSlopes = noOfSlopes;
		this.country = country;
	}
	
	public SkiResort() {
		super();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getNoOfLifts() {
		return noOfLifts;
	}

	public int getNoOfSlopes() {
		return noOfSlopes;
	}
	
	public Country getCountry() {
		return country;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNoOfLifts(int noOfLifts) {
		this.noOfLifts = noOfLifts;
	}

	public void setNoOfSlopes(int noOfSlopes) {
		this.noOfSlopes = noOfSlopes;
	}
	
	public void setCountry(Country country) {
		this.country = country;
	}
}
