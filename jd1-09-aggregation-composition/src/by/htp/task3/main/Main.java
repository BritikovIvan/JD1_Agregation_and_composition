package by.htp.task3.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.task3.entity.City;
import by.htp.task3.entity.Region;
import by.htp.task3.entity.State;
import by.htp.task3.view.StatePrinter;

public class Main {
	
	public static void main(String[] args) {
		List<Region> regions = new ArrayList<Region>();
		regions.add(new Region("Minsk region", "Minsk"));
		regions.add(new Region("Mogilev region", "Mogilev"));
		regions.add(new Region("Gomel region", "Gomel"));
		regions.add(new Region("Brest region", "Brest"));
		regions.add(new Region("Grodno region", "Grodno"));
		regions.add(new Region("Vitebsk region", "Vitebsk"));
		
		State state = new State("Belarus", new City("Minsk"), 207_596, regions);
		StatePrinter printer = new StatePrinter();
		
		printer.printCapital(state);
		printer.printArea(state);
		printer.printNumberRegions(state);
		printer.printRegionCenters(state);
		
	}

}
