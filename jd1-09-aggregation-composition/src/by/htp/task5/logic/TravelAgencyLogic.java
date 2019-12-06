package by.htp.task5.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.task5.entity.Food;
import by.htp.task5.entity.Tour;
import by.htp.task5.entity.Transport;
import by.htp.task5.entity.TravelAgency;

public class TravelAgencyLogic {

	public List<Tour> findByTransport(TravelAgency travelAgency, Transport transport) {

		List<Tour> tours = travelAgency.getTours();
		List<Tour> result = new ArrayList<Tour>();

		for (Tour tour : tours) {

			Transport t = tour.getTransport();
			if (t.equals(transport)) {
				result.add(tour);
			}
		}

		return result;

	}

	public List<Tour> findByFood(TravelAgency travelAgency, Food food) {

		List<Tour> tours = travelAgency.getTours();
		List<Tour> result = new ArrayList<Tour>();

		for (Tour tour : tours) {

			Food f = tour.getFood();
			if (f.equals(food)) {
				result.add(tour);
			}
		}

		return result;

	}

	public List<Tour> findByDuration(TravelAgency travelAgency, int duration) {

		List<Tour> tours = travelAgency.getTours();
		List<Tour> result = new ArrayList<Tour>();

		for (Tour tour : tours) {

			int d = tour.getDuration();
			if (d == duration) {
				result.add(tour);
			}
		}

		return result;

	}

}
