package by.htp.task5.view;

import by.htp.task5.entity.Tour;
import by.htp.task5.entity.TravelAgency;

public class TravelAgencyPrinter {
	
	public void print(TravelAgency travelAgency) {
		
		System.out.println("Travel agency \"" + travelAgency.getName() +"\"");
		System.out.println("Our tours: ");
		TourPrinter printer = new TourPrinter();
		for (Tour tour : travelAgency.getTours()) {
			printer.print(tour);
		}
		
	}

}
