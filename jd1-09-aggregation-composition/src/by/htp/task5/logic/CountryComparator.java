package by.htp.task5.logic;

import java.util.Comparator;

import by.htp.task5.entity.Tour;

public class CountryComparator implements Comparator<Tour> {

	@Override
	public int compare(Tour t1, Tour t2) {
		
		return t1.getCountry().compareTo(t2.getCountry());
		
	}

}
