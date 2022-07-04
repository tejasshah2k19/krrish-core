package generics;

import java.util.ArrayList;

public class GenericDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();

		MathDemo<Integer> m = new MathDemo<Integer>();
		m.setX(12);
		m.setY(10);
		System.out.println(m.getX() + m.getY());

		MathDemo<Float> mf = new MathDemo<Float>();
		mf.setX(20.20f);
		mf.setY(30.30f);
		System.out.println(mf.getX() + mf.getY());

//		MathDemo<String> mfs = new MathDemo<String>();

	}
}

//class
class MathDemo<T extends Number> {

	T x;
	T y;

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public T getY() {
		return y;
	}

	public void setY(T y) {
		this.y = y;
	}

}
