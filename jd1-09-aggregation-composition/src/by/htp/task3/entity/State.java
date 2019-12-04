package by.htp.task3.entity;

import java.util.List;

public class State {
	
	private String name;
	private City capital;
	private int area;
	private List<Region> regions;
	
	public State(String name, String capital, int area) {
		this.name = name;
		this.capital = new City(capital);
		this.area = area;
	}
	
	public State(String name, City capital, int area) {
		this.name = name;
		this.capital = capital;
		this.area = area;
	}
	
	public State(String name, City capital, int area, List<Region> regions) {
		this.name = name;
		this.capital = capital;
		this.area = area;
		this.regions = regions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + area;
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((regions == null) ? 0 : regions.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		State other = (State) obj;
		if (area != other.area)
			return false;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (regions == null) {
			if (other.regions != null)
				return false;
		} else if (!regions.equals(other.regions))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "State [name=" + name + ", capital=" + capital + ", square=" + area + ", regions=" + regions + "]";
	}

}
