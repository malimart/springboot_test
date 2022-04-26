package local.slopes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import local.skiResorts.SkiResort;

@Entity
public class Slope {
	@Id
	private int id;
	private String name;
	private String difficulty;
	private int length;
	@ManyToOne
	private SkiResort skiResort;

	public Slope() {
	}

	public Slope(int id, String name, String difficulty, int length, SkiResort skiResort) {
		super();
		this.id = id;
		this.name = name;
		this.difficulty = difficulty;
		this.length = length;
		this.skiResort = skiResort;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDifficulty() {
		return difficulty;
	}
	
	public int getLength() {
		return length;
	}
	
	public SkiResort getSkiResort() {
		return skiResort;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public void setSkiResort(SkiResort skiResort) {
		this.skiResort = skiResort;
	}
}
