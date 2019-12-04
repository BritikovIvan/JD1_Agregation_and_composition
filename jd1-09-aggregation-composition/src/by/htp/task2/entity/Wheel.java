package by.htp.task2.entity;

public class Wheel {

	private String model;
	private boolean isBroken;

	public Wheel() {

	}
	
	public Wheel(String model) {
		this.model = model;
		this.isBroken = false;
	}
	
	public Wheel(String model, boolean isBroken) {
		this.model = model;
		this.isBroken = isBroken;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public boolean isBroken() {
		return isBroken;
	}

	public void setBroken(boolean isBroken) {
		this.isBroken = isBroken;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isBroken ? 1231 : 1237);
		result = prime * result + ((model == null) ? 0 : model.hashCode());
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
		Wheel other = (Wheel) obj;
		if (isBroken != other.isBroken)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Wheel [model=" + model + ", isBroken=" + isBroken + "]";
	}

}
