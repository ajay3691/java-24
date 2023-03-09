package LambdaEx;

interface InterF1{
	public abstract void display();
}
public class TestTwo {

	public static void main(String[] args) {
		InterF1 obj = ()->{  System.out.println("Displaying Data"); };
		obj.display();
	}

}
