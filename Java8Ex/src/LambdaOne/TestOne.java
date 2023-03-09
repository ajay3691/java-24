package LambdaOne;

@FunctionalInterface
interface CalcInterface{
	public abstract int square(int a);
}

public class TestOne implements CalcInterface {
	@Override
	public int square(int a) {
		return a*a;
	}
	public static void main(String[] args) {
	TestOne t = new TestOne();
	System.out.println(t.square(10));

	}

	

}
