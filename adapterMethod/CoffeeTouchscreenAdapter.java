package adapterMethod;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
	OldCoffeeMachine oldCoffeeMachine;
	
	CoffeeTouchscreenAdapter(OldCoffeeMachine machine){
		oldCoffeeMachine = machine;
	}
	@Override
	public void chooseFirstSelection() {
		oldCoffeeMachine.SelectA();
	}

	@Override
	public void chooseSecondSelection() {
		oldCoffeeMachine.SelectB();
	}

}
