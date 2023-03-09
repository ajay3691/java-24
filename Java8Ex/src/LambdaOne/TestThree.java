package LambdaOne;

interface CalcInterfaceOne{
	public abstract boolean test(int n);
}

public class TestThree implements CalcInterfaceOne{
	@Override
	public boolean test(int n) {
		
		return n<1000;
	}

	public static void main(String[] args) {
		TestThree t = new TestThree();
		System.out.println(t.test(888));

	}

	
}
