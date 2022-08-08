package streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(100);
		list.add(1000);
		list.add(200);
		list.add(300);
		
		//map function
		List<Integer> sqr =  list.stream().map(v->v*v).collect(Collectors.toList());
       System.out.println(list);
       System.out.println(sqr);
       
       Integer max = list.stream().mapToInt(v->v).max().getAsInt();
       System.out.println(max);
	
	}
}
