package starbuzzdecorator.com.main;

import starbuzzdecorator.com.model.Beverage;
import starbuzzdecorator.com.model.CondimentDecorator;

public class Mocha extends CondimentDecorator{
	Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription()+" , Mocha.";
	}

	@Override
	public double cost() {
		return .20 + this.beverage.cost();
	}

}
