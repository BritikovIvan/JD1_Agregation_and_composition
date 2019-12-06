package by.htp.task5.logic;

import java.util.Comparator;

import by.htp.task5.entity.Tour;

public class DurationComparator implements Comparator<Tour> {

	@Override
	public int compare(Tour t1, Tour t2) {
		
		int duration1 = t1.getDuration();
		int duration2 = t2.getDuration();
		
		if (duration1 < duration2) {
			return -1;
		} else if (duration1 == duration2) {
			return 0;
		} else {
			return 1;
		}
		
	}

}
