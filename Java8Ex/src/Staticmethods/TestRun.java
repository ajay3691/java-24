package Staticmethods;

interface Dao{
	public static void m1() {
		System.out.println("Static Method");
	}
}
public class TestRun {

	public static void main(String[] args) {
		Dao.m1();

	}

}
