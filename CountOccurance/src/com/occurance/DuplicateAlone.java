package com.occurance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateAlone {
	public static void main(String[] args) {
		String g = "discussion";
		//char[] a = g.toCharArray();
		HashSet<Character> hs = new HashSet<Character>();
		HashSet<Character> dup = new HashSet<Character>();
		
		
		
//		for(Character c:g.toCharArray()) {
//		if(!hs.add(c)) {
//			dup.add(c);
//		}	
//	}
//		System.out.println(dup);
		
		//Using stream
		List<Character> ll= new ArrayList<Character>();
		for(Character c: g.toCharArray()) {
			ll.add(c);
		}
		Map<Character,Long> map = ll.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));
		System.out.println("map:"+map);
		
		Set<Character> f = ll.stream().filter(x->!hs.add(x)).collect(Collectors.toSet());
		System.out.println("Using stream set:"+f);
		
		
		int count;
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int j=0;j<g.length();j++) {
			char c = g.charAt(j);
			if(hm.containsKey(c)) {
				count = hm.get(c);
				count++;
				hm.replace(c, count);	
			}
			else {
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
		
	}
	
	
}
