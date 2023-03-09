package LambdaEx;


interface CalcI1{
	void add(int a, int b);
}
public class TestCalcOne {

	public static void main(String[] args) {
	 //CalcI1	i=(int a, int b)->{ System.out.println(a+b); };
	 //CalcI1	i=(int a, int b)-> System.out.println(a+b);
	 CalcI1	i=( a, b)-> System.out.println(a+b);
	 i.add(10,20);
	}

}
