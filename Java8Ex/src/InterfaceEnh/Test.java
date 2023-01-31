package InterfaceEnh;

interface TestInterface{
void m1();
void m2();
void m3();
}

class TestOne implements TestInterface{
	public void m1() {
		System.out.println("TestOne - m1() method");
	}
	public void m2() {
		System.out.println("TestOne - m2() method");
	}
}
class TestTwo implements TestInterface{
	public void m1() {
		System.out.println("TestTwo - m1() method");
	}
	public void m2() {
		System.out.println("TestTwo- m2() method");
	}
}

public class Test {
	public static void main(String[] args) {
		TestOne t1 = new TestOne();
		TestTwo t2 = new TestTwo();
		t1.m1();
		t1.m2();
		t2.m1();
		t2.m2();
 	}
}
