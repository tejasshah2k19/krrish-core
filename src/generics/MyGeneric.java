package generics;

public class MyGeneric {

	public static void main(String[] args) {

		GenerateArray<Integer> gi = new GenerateArray<Integer>();// Integer
		gi.a = new Integer[5];

		GenerateArray<Float> gf = new GenerateArray<>();// Float
		gf.a = new Float[5];

		GenerateArray<String> gs = new GenerateArray<>();// Float
		gs.a = new String[5];

	}
}

class GenerateArray<T> {
	T a[];// array

}