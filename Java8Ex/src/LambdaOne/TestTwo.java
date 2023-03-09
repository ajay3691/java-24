package LambdaOne;

import java.util.function.Function;

public class TestTwo {
	//static Function<Integer, Integer> f = n-> n*n;
	static Function<Integer, Integer> f = (n)->{ return n*n;};
	public static void main(String[] args) {
	System.out.println(f.apply(10));

	}

}
