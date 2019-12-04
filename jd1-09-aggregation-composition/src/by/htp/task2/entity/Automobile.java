package by.htp.task2.entity;

import java.util.Arrays;

public class Automobile {
	
	private String model;
	private Engine engine;
	private boolean isRefueld;
	private Wheel[] wheels = new Wheel[NUMBER_WHEELS];
	
	private static final int NUMBER_WHEELS = 4;
	
	public Automobile(String model, Engine engine, boolean isRefueld, Wheel[] wheels) {
		this.model = model;
		this.engine = engine;
		this.isRefueld = isRefueld;
		this.wheels = wheels;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}

	public boolean isRefueld() {
		return isRefueld;
	}

	public void setRefueld(boolean isRefueld) {
		this.isRefueld = isRefueld;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + (isRefueld ? 1231 : 1237);
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + Arrays.hashCode(wheels);
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
		Automobile other = (Automobile) obj;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (isRefueld != other.isRefueld)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (!Arrays.equals(wheels, other.wheels))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Automobile [model=" + model + ", engine=" + engine + ", isRefueld=" + isRefueld + ", wheels="
				+ Arrays.toString(wheels) + "]";
	}

}
