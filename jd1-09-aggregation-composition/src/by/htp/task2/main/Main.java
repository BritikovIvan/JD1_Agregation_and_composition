package by.htp.task2.main;

import by.htp.task2.entity.Automobile;
import by.htp.task2.entity.Engine;
import by.htp.task2.entity.Wheel;
import by.htp.task2.logic.AutomobileLogic;
import by.htp.task2.view.AutomobilePrinter;

public class Main {
	
	public static void main(String[] args) {
		Wheel[] wheels = new Wheel[4];
		wheels[0] = new Wheel("Michelin");
		wheels[1] = new Wheel("Michelin");
		wheels[2] = new Wheel("Michelin", true);
		wheels[3] = new Wheel("Michelin");
		
		Engine engine = new Engine("V10");
		
		Automobile automobile = new Automobile("Audi", engine, true, wheels);
		
		AutomobilePrinter printer = new AutomobilePrinter();
		
		printer.drive(automobile);
		
		AutomobileLogic logic = new AutomobileLogic();
		Wheel wheel = new Wheel("Michelin");
		logic.changeWheel(automobile, wheel, 2);
		
		printer.drive(automobile);
	}

}
