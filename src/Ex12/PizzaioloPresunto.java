package Ex12;

public class PizzaioloPresunto extends Pizzaiolo {

	@Override
	public Calzone calzone() {
		
		return new CalzonePresunto();
	}

	@Override
	public Pizza pizza() {
		
		return new PizzaPresunto();
	}

}
