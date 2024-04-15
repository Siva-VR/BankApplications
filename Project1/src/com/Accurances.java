package com;

import java.util.Map;
import java.util.TreeMap;

public class Accurances {
	public static void main(String[] args) {
		String name = "Basheer ";
		name =name.replaceAll("\\s", ""); 
		char[] namearray = name.toCharArray();

		Map<Character, Integer> mp = new TreeMap<>();

		for (Character ch : namearray) {
			if (mp.get(ch) == null) {
				mp.put(ch, 1);
			} else {
				Integer occurancecount = mp.get(ch);
				mp.put(ch, occurancecount + 1);
			}

		}
		System.out.println("Character Occurrences Count in a String:");
		for(Map.Entry<Character,Integer> m : mp.entrySet()){    
		    System.out.println(m.getKey()+"= "+m.getValue());    
		   }  
	}

}
