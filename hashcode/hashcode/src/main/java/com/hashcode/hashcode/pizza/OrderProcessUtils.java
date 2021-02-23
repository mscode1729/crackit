package com.hashcode.hashcode.pizza;

import java.util.List;
import java.util.Map;

public class OrderProcessUtils {

	private static List<Pizza> availablePizzas;
	
	private static Map<String,List<Pizza>> mapofTeamAndPizza;
	
	
	public static List<Pizza> getAvailablePizzas(int teamNo) {
		//team
		return availablePizzas;
	}
	
	void initialiseTeamPizzaMap() {
		//Logic for per team distinctpizzas
	}
	
}
