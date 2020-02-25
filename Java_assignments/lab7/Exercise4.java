package lab7;

import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Exercise4 {

	static HashMap<Integer,String> getStudents(HashMap<Integer, Integer> hashMap){
		
		HashMap<Integer,String> hashMap1=new HashMap<>();
		
		Set<Integer> reg_set=hashMap.keySet();
		String medal=null;
		int marks;
		for(Integer key:reg_set) {
			marks=hashMap.get(key);
			
			if(marks>=90)
				medal="Gold";
			else if(marks>=80 && marks<90)
				medal="Silver";
			else if(marks>=70 && marks<80)
				medal="Bronze";
			
			hashMap1.put(key,medal);
		}
		return hashMap1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int reg[]= {10,11,12,13};
		int marks[]= {88,78,45,90};
		HashMap<Integer,Integer> hashMap2=new HashMap<>();
		for(int i=0;i<marks.length;i++) {
		hashMap2.put(reg[i], marks[i]);
		}
		/*for(int i:hashMap2.keySet()) {
			System.out.println(i+" "+hashMap2.get(i));
		}*/
		
		HashMap<Integer,String> myList=getStudents(hashMap2);
		System.out.println(myList);
	}

}
