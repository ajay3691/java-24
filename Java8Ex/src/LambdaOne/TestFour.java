package LambdaOne;

import java.util.function.Predicate;

public class TestFour {
	//static Predicate<Integer> p = (n)->{return n<1000;};
	static Predicate<Integer> p = n-> n<1000;
	public static void main(String[] args) {
		System.out.println(p.test(888));
	}

}
