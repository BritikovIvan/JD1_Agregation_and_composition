package by.htp.task5.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import by.htp.task5.entity.Food;
import by.htp.task5.entity.Tour;
import by.htp.task5.entity.TourType;
import by.htp.task5.entity.Transport;
import by.htp.task5.entity.TravelAgency;
import by.htp.task5.logic.CountryComparator;
import by.htp.task5.logic.DurationComparator;
import by.htp.task5.logic.TravelAgencyLogic;
import by.htp.task5.view.TourPrinter;
import by.htp.task5.view.TravelAgencyPrinter;

public class Main {

	public static void main(String[] args) {
		
		List<Tour> tours = new ArrayList<Tour>();
		tours.add(new Tour("USA", TourType.RECREATION, Transport.PLAINE, Food.UAI, 30));
		tours.add(new Tour("Great Britain", TourType.EXCURSION, Transport.TRAIN, Food.AI, 20));
		tours.add(new Tour("Iceland", TourType.RECREATION, Transport.SHIP, Food.RO, 10));
		tours.add(new Tour("Canada", TourType.EXCURSION, Transport.PLAINE, Food.AI, 40));
		
		TravelAgency agency = new TravelAgency("TravelHouse", tours);
		TravelAgencyPrinter printer = new TravelAgencyPrinter();
		printer.print(agency);
		System.out.println("-------------------------------------------------------------------------------------------------");
		
		Collections.sort(agency.getTours(), new CountryComparator());
		printer.print(agency);
		System.out.println("-------------------------------------------------------------------------------------------------");
		
		Collections.sort(agency.getTours(), new DurationComparator());
		printer.print(agency);
		System.out.println("-------------------------------------------------------------------------------------------------");
		
		TravelAgencyLogic logic = new TravelAgencyLogic();
		List<Tour> tours2 = logic.findByFood(agency, Food.AI);
		TourPrinter tourPrinter = new TourPrinter();
		for (Tour t : tours2) {
			tourPrinter.print(t);
			System.out.println();
		}
		
	}

}
