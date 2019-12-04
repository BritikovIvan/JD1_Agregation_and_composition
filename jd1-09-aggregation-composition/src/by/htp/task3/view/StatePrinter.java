package by.htp.task3.view;

import java.util.List;

import by.htp.task3.entity.Region;
import by.htp.task3.entity.State;

public class StatePrinter {
	
	public void printCapital(State state) {
		System.out.println(state.getCapital().getName() + " is the capital of " + state.getName());
	}
	
	public void printNumberRegions(State state){
		int numberRegions = state.getRegions().size();
		System.out.println(state.getName() + " has " + numberRegions + " regions");
	}
	
	public void printArea(State state) {
		System.out.println("The area of " + state.getName() + " is " + state.getArea() + " square kilometers");
	}
	
	public void printRegionCenters(State state) {
		List<Region> regions = state.getRegions();
		System.out.println("Regional centers of " + state.getName() + ":");
		for (Region region : regions) {
			System.out.print(region.getCenter().getName() + "\t");
		}
		System.out.println();
	}

}
