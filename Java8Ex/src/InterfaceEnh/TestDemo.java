package InterfaceEnh;

interface TestInterf{
void m1();
void m2();
public default void m3() {
	System.out.println("defaullt Method");
}
}

class Test1 implements TestInterf{
	public void m1() {
		System.out.println("TestOne - m1() method");
	}
	public void m2() {
		System.out.println("TestOne - m2() method");
	}
}
class Test2 implements TestInterf{
	public void m1() {
		System.out.println("TestTwo - m1() method");
	}
	public void m2() {
		System.out.println("TestTwo- m2() method");
	}
}

public class TestDemo {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		t1.m1();
		t1.m2();
		t1.m3();
		t2.m1();
		t2.m2();
 	}
}
