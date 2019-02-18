package starbuzzdecorator.com.main;

import starbuzzdecorator.com.model.Beverage;
import starbuzzdecorator.com.model.CondimentDecorator;

public class Whip extends CondimentDecorator{
	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription()+" , Whip";
	}

	@Override
	public double cost() {
		return .30 + this.beverage.cost();
	}

}
