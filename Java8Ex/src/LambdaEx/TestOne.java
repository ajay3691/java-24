package LambdaEx;

@FunctionalInterface
interface InterF{
	public abstract void display();
	
}

public class TestOne implements InterF {
	public void display() {
		System.out.println("Displaying Data");
	}
	public static void main(String[] args) {
		InterF obj = new TestOne();
		obj.display();

	}

}
