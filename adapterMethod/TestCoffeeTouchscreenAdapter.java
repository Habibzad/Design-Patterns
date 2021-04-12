package adapterMethod;

public class TestCoffeeTouchscreenAdapter {

	public static void main(String[] args) {
		OldCoffeeMachine machine = new OldCoffeeMachine();
		CoffeeTouchscreenAdapter ctsa = new CoffeeTouchscreenAdapter(machine);
		ctsa.chooseFirstSelection(); //Prints "Making coffee A"
		ctsa.chooseSecondSelection(); //Prints "Making coffee B"
	}

}
