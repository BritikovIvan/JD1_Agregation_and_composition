package by.htp.task2.view;

import by.htp.task2.entity.Automobile;
import by.htp.task2.logic.AutomobileLogic;

public class AutomobilePrinter {
	
	public void drive(Automobile automobile) {
		AutomobileLogic logic = new AutomobileLogic();
		if (logic.drive(automobile)) {
			System.out.println("The automobile is driving.");
		} else {
			System.out.println("The automobile can not drive.");
		}
	}

}
