package by.htp.task5.entity;

public class Tour {
	
	private String country;
	private TourType tourType;
	private Transport transport;
	private Food food;
	private int duration;
	
	public Tour(String country, TourType tourType, Transport transport, Food food, int duration) {
		super();
		this.country = country;
		this.tourType = tourType;
		this.transport = transport;
		this.food = food;
		this.duration = duration;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public TourType getTourType() {
		return tourType;
	}

	public void setTourType(TourType tourType) {
		this.tourType = tourType;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + duration;
		result = prime * result + ((food == null) ? 0 : food.hashCode());
		result = prime * result + ((tourType == null) ? 0 : tourType.hashCode());
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
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
		Tour other = (Tour) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (duration != other.duration)
			return false;
		if (food != other.food)
			return false;
		if (tourType != other.tourType)
			return false;
		if (transport != other.transport)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tour [country=" + country + ", tourType=" + tourType + ", transport=" + transport + ", food=" + food
				+ ", duration=" + duration + "]";
	}

}
