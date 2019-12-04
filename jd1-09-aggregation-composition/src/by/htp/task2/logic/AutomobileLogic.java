package by.htp.task2.logic;

import by.htp.task2.entity.Automobile;
import by.htp.task2.entity.Wheel;

public class AutomobileLogic {
	
	public void fuel(Automobile automobile) {
		automobile.setRefueld(true);
	}

	public void changeWheel(Automobile automobile, Wheel wheel, int position) {
		Wheel[] wheels = automobile.getWheels();
		if (position < wheels.length) {
			wheels[position] = wheel;
		}
	}
	
	public boolean drive(Automobile automobile) {
		Wheel[] wheels = automobile.getWheels();
		for (int i = 0; i < wheels.length; i++) {
			if (wheels[i].isBroken()) {
				return false;
			}
		}
		
		if (!automobile.isRefueld()) {
			return false;
		}
		
		return true;
	}

}
