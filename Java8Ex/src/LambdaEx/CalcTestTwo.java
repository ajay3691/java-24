package LambdaEx;

interface MultiEx{
  public abstract int	multiply(int a, int b);
}
public class CalcTestTwo {

	public static void main(String[] args) {
		//MultiEx m = (a,b)-> a*b;
		MultiEx m= (int a, int b)-> {  return a*b;};
		System.out.println(m.multiply(5, 6));
	}

}
