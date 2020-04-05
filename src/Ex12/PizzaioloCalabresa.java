package Ex12;

public class PizzaioloCalabresa extends Pizzaiolo {

	@Override
	public Calzone calzone() {
		
		return new CalzoneCalabresa();
	}

	@Override
	public Pizza pizza() {
		
		return new PizzaCalabresa();
	}

}
