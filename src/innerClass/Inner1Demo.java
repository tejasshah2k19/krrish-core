package innerClass;

public class Inner1Demo {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner oi = o.new Inner();
		// o.innerMethod(10);// Outer
		oi.innerMethod();// inner
//		oi.innerMethod(12);//inner

		System.out.println("********************");
		MyOuter mo = new MyOuter();
		mo.createInner();
		System.out.println("***************");
		StaticOuter.SInner si = new StaticOuter.SInner();
		si.myInner();
	}
}

class Outer {
	private int x = 90;

	// inner class
	void innerMethod(int x) {
		System.out.println("innerMethod() :: Outer");
	}

	class Inner extends Outer {
		void innerMethod() {
			innerMethod(2);
			System.out.println("innerMethod() :: Inner => " + x);
		}

//		void innerMethod(long l) {
//			System.out.println("innerMethod() :: Inner");
//		}

	}
}

class MyOuter {
	private int x = 90;

	// method local inner class
	void createInner() {
		int l = 900;
		class MyInner {
			void innerMethod() {
				System.out.println("inner()");
				System.out.println(x);
				System.out.println(l);// java 7
			}
		}
		MyInner mi = new MyInner();
		mi.innerMethod();
		System.out.println("inside createInner()");
	}
}
//String 	
// char[]

//Map 
// Set

//Jaguar - car 
// tata

//nested class 
class StaticOuter {

	static class SInner {
		void myInner() {
			System.out.println("myInner()");
		}
	}
}
