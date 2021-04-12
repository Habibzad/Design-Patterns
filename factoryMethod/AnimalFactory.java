package factoryMethod;

public class AnimalFactory {
	public static Animal createAnimal(String type) {
		if(type.equals("dog")) {
			return new Dog();
		}else if(type.equals("cow")) {
			return new Cow();
		}else if(type.equals("cat")) {
			return new Cat();
		}else {
			return null;
		}
	}
}
