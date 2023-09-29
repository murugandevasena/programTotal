package com.occurance;

import java.util.HashMap;
import java.util.HashSet;

public class GetDuplicatesAlone {
	public static void main(String[] args) {
		String g ="onesofttechnology";
		HashSet<Character> uniq = new HashSet<Character>();
		HashSet<Character> duplicate = new HashSet<Character>();
		for(Character c:g.toCharArray()) {
			if(!uniq.add(c)) {
				duplicate.add(c);
			}
		}
		for(Character c1:duplicate) {
			System.out.println(c1);
		}
		
		//Repeated letters count
		char c;
		int count=1;
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i=0;i<g.length();i++) {
			c= g.charAt(i);
			if(hm.containsKey(c)) {
				count = hm.get(c);
				count++;
				hm.replace(c, count);
			}
			else {
				hm.put(c, 1);
			}
		}
		for(Character key:hm.keySet()) {
			System.out.println(key+" "+hm.get(key));
		} 
		
		
		
	}

}
