package LambdaEx;

interface CalcI{
	public abstract void add(int a, int b);
}

public class TestCalc implements CalcI {
	@Override
	public void add(int a, int b) {
		System.out.println(a+b);
		
	}

	public static void main(String[] args) {
		CalcI obj = new TestCalc();
		obj.add(10, 20);
	}

	
}
