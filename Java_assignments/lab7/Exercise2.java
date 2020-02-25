package lab7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Exercise2 {

	static HashMap<Character,Integer> countCharacter(Character ar[]){
		HashMap<Character,Integer>hashMap=new HashMap();
		
		List<Character> list1=Arrays.asList(ar);
		
		int c=0;
		for(Character ch:list1) {
			c=0;
			c=Collections.frequency(list1,ch);
			hashMap.put(ch, c);
			
		}
		return hashMap;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Character character[]= {'a','b','c','d','e','a','d','f'};
		System.out.println(countCharacter(character));
	}

}
