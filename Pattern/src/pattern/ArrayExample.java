package pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayExample {
	public static void main(String[] args) {
		
		//Array to ArrayList
		int[] a = {10,20,30,40};
		List<Integer> list = Arrays.asList(10,20);
		List<Integer> l1 = Arrays.stream(a).boxed().collect(Collectors.toList());
		System.out.println(list);
		System.out.println(l1);
		
		//Arraylist to Array
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(3);
		l2.add(4);
		l2.add(5);
		l2.add(6);
		
		Integer [] a2 = l2.toArray(new Integer[l2.size()]);
		for(Integer x:a2) {
			System.out.print(x+" ");
		}
		
	    	
	}
}

