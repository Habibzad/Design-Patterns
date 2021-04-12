package singletonMethod;

public class SingletonPatternDemo {
	public static void main(String[] args) {

	      //Get the only object available
	      SingleObject object = SingleObject.getInstance();
	      SingleObject obj = SingleObject.getInstance();
	      //show the message
	      object.showMessage("Hello");
	      obj.showMessage("Hi");
	   }
}
