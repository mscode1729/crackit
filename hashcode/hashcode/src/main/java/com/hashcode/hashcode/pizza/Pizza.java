package com.hashcode.hashcode.pizza;

import java.util.List;

public class Pizza {

	private String pizzaId;

	List<String> ingredients;

	public String getPizzaId() {
		return pizzaId;
	}

	public void setPizzaId(String pizzaId) {
		this.pizzaId = pizzaId;
	}

	public List<String> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}

}
