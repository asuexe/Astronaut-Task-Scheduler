package pizzaBuilder;

public class PizzaBuilder {
	  private Pizza pizza;
	  public PizzaBuilder() {
	    pizza = new Pizza();
	  }
	  public PizzaBuilder setDough(String dough) {
	    pizza.setDough(dough);
	    return this;
	  }
	  public PizzaBuilder setSauce(String sauce) {
	    pizza.setSauce(sauce);
	    return this;
	  }
	  public PizzaBuilder setTopping(String topping) {
	    pizza.setTopping(topping);
	    return this;
	  }
	  public Pizza build() {
	    return pizza;
	  }
	}