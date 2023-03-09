package DateTime;

import java.time.Year;

public class Test {
public static void main(String[] args) {
	int y = 2024;
	if(Year.isLeap(y)) {
			System.out.println("Yes Leap Year");
	}
	else {
		System.out.println("Not a Leap Year");
	}
}
}
