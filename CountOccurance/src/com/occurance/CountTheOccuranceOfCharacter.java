package com.occurance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountTheOccuranceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String g = "java is best language";
		int count;
		char ch;
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < g.length(); i++) {
			ch = g.charAt(i);
			if (hm.containsKey(ch)) {
				count = hm.get(ch);
				count++;
				hm.replace(ch, count);
			}
			else {
				hm.put(ch, 1);
			}
		}
		for(Character key:hm.keySet()) {
			System.out.println(key+" "+hm.get(key));
		}
		
		//using stream
		
		List<Character> lk = new ArrayList<Character>();
		for(Character x: g.toCharArray()) {
			lk.add(x);
		}
		Map<Character,Long> map= lk.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
		System.out.println("Using stream:"+map);
		
	}
	

}
