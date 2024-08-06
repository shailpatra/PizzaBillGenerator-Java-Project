package bill;

import java.util.Scanner;

public class pizza {
	
	protected int price;
	private Boolean veg;
	
	protected int extraCheesePrice = 100;
	protected int extraToopingsPrice = 150;
	protected int backPackPrice = 20;
	
	protected int basePizzaPrice;
	
	private Boolean isExtraCheeseAdded = false;
	private Boolean isExtraToopingsAdded = false;
	private Boolean isOptedForTakeaway = false;
	
	Scanner in = new Scanner(System.in);

	public pizza(Boolean veg) {
		this.veg = veg;

		if (this.veg) {
			this.price = 300;
		} else {
			this.price = 400;
		}
		basePizzaPrice = this.price;
	}
	
	public void addExtraCheese() {
		System.out.println("Do you Need Extra Cheese (y/n)? =>");
		char ch = Character.toLowerCase(in.next().charAt(0));
		
		switch (ch) {
		case('y'):
			isExtraCheeseAdded = true;
			this.price += extraCheesePrice;
			break;
		case('n'):
			isExtraCheeseAdded = false;
			break;
		}
	}
	
	public void addExtraToopings() {
		System.out.println("Do you Need Extra Toopings (y/n)? =>");
		char ch = Character.toLowerCase(in.next().charAt(0));
		
		switch (ch) {
		case('y'):
			isExtraToopingsAdded = true;
			this.price += extraToopingsPrice;
			break;
		case('n'):
			isExtraToopingsAdded = false;
			break;
		}
	}
	
	public void takeAway() {
		System.out.println("Want to takeaway (y/n)? =>");
		char ch = Character.toLowerCase(in.next().charAt(0));
		
		switch (ch) {
		case('y'):
			isOptedForTakeaway = true;
			this.price += backPackPrice;
			break;
		case('n'):
			isOptedForTakeaway = false;
			break;
		}
	}
	
	public void getBill() {
		String bill ="";
		
		System.out.println("Pizza : " +basePizzaPrice);
		
		if(isExtraCheeseAdded) {
			bill = bill +"Extra Cheese : " +extraCheesePrice +"\n";
		}
		if(isExtraToopingsAdded) {
			bill = bill +"Extra Toopings : " +extraToopingsPrice +"\n";
		}
		if(isOptedForTakeaway) {
			bill = bill +"Take Away : " +backPackPrice +"\n";
		}
		
		bill = bill + "\nTotal Amount : " +this.price +"\n";
		
		System.out.println(bill);
		System.out.println("\n\nThanks Vist Again.....");
		System.out.println("--------------------------------------------------------------------------------------");
	}
}

