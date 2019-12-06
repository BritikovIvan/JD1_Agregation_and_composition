package by.htp.task5.view;

import by.htp.task5.entity.Tour;

public class TourPrinter {

	public void print(Tour tour) {

		System.out.println("Tour:");
		System.out.println("Country: " + tour.getCountry() + "\tTour type: " + tour.getTourType() + "\tTransport: "
				+ tour.getTransport() + "\tFood: " + tour.getFood() + "\tDuration: " + tour.getDuration());

	}

}
