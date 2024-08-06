package bill;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("<------------------------------------Welcome to Pizzamania!------------------------------------------>");
		System.out.println("Select the type of pizza:");
		System.out.println("1. Veg Pizza");
		System.out.println("2. Non-Veg Pizza");
		System.out.println("3. Delux Veg Pizza");
		System.out.println("4. Delux Non-Veg Pizza");

		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		switch (i) {
		case 1:
			pizza vegpizza = new pizza(true);
			PizzaShop v = new PizzaShop();
			v.pizzafun(vegpizza);
			break;
		case 2:
			pizza nonvegpizza = new pizza(false);
			PizzaShop n = new PizzaShop();
			n.pizzafun(nonvegpizza);
			break;
		case 3:
			DeluxPizza veg = new DeluxPizza(true);
			veg.basePizzaPrice = 550;
			PizzaShop dv = new PizzaShop();
			dv.pizzafun(veg);
			break;
		case 4:
			DeluxPizza nonveg = new DeluxPizza(false);
			nonveg.basePizzaPrice = 650;
			PizzaShop dnv = new PizzaShop();
			dnv.pizzafun(nonveg);
			break;
			 
		default:
			System.out.println("Sorry Enter again");
		}
	
		sc.close();

	}
}
