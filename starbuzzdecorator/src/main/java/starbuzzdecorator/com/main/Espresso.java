package starbuzzdecorator.com.main;

import starbuzzdecorator.com.model.Beverage;

public class Espresso extends Beverage{
	
	public Espresso() {
		super.description = "Espresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
