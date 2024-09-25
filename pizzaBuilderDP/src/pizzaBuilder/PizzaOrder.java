package pizzaBuilder;

public class PizzaOrder {
	  public static void main(String[] args) {
	    Pizza p = new PizzaBuilder()
	        .setDough("Thin")
	        .setSauce("Marinara")
	        .setTopping("Pepperoni")
	        .build();
	    System.out.println(p);
	  }
	}
