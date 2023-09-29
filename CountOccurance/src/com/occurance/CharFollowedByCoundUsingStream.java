package com.occurance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharFollowedByCoundUsingStream {
	public static void main(String[] args) {
		//char[] a = { 't', 'e', 'e', 's', 's', 's', 'h' };
		//List<Character> l = new ArrayList<Character>();
//		for(Character c:a ) {
//			l.add(c);
//		}
//		System.out.println(l);
		List<Character> list = Arrays.asList( 't', 'e', 'e', 's', 's', 's', 'h');
		String lastOutput = StringCount(list);
		System.out.println(lastOutput);
		
		List<Character> lk = new ArrayList<Character>();
		String g ="aabbcccdddd";
		char[] g1= g.toCharArray();
		for(Character c:g1) {
			lk.add(c);
		}
		Map<Character, Long> m = lk.stream().collect(Collectors.groupingBy(c->c,Collectors.counting()));
		System.out.println(m);
	}

	private static String StringCount(List<Character> list) {
		StringBuilder sb= new StringBuilder();
		Map<Character, Long> map = list.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
		//System.out.println(map);
		for(Map.Entry<Character, Long> l : map.entrySet()){
			sb.append(l.getKey());
			if(l.getValue()>1||l.getValue()==1) {
				sb.append(l.getValue());
			}
		}
		return sb.toString();
	}

}
