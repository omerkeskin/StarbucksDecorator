package starbuzzdecorator.com.main;

import starbuzzdecorator.com.model.Beverage;

public class Simulator {

	public static void main(String[] args) {
		
		Beverage espresso = new Espresso();
		System.out.println(espresso.getDescription()+ "  $"+espresso.cost());
		
		Beverage houseBlend = new HouseBlend();
		System.out.println(houseBlend.getDescription()+ "  $"+houseBlend.cost());
		
		houseBlend = new Mocha(houseBlend);
		System.out.println(houseBlend.getDescription()+ "  $"+houseBlend.cost());
		
		houseBlend = new Whip(houseBlend);
		System.out.println(houseBlend.getDescription()+ "  $"+houseBlend.cost());
	}

}
