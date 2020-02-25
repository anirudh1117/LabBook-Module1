package lab7;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Exercise6 {

	static List<Integer> voterList(HashMap<Integer, LocalDate> hashMap){
		Set<Integer> set1=hashMap.keySet();
		
		/*Calendar calendar1=Calendar.getInstance();
		Calendar calendar2=Calendar.getInstance();
		
		for(Integer integer:set1) {
			Date date1=hashMap.get(integer);
			calendar1.set(date1.getYear()+1900,date1.getMonth(),date1.getDate());
		}
		return null;
		
		*/
		List<Integer> list1=new ArrayList<Integer>();
		LocalDate localDate=null;
		LocalDate date=LocalDate.now();
		
		for(Integer i:set1) {
			localDate=hashMap.get(i);
			
			int year=Period.between(localDate, date).getYears();
			
			if(year>=18)
				list1.add(i);
		}
		return list1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,LocalDate> hashMap=new HashMap<>();
		
		hashMap.put(1001,LocalDate.of(2000, 1, 11));
		hashMap.put(1002,LocalDate.of(2003, 5, 5));
		hashMap.put(1031,LocalDate.of(2015, 8, 2));
		hashMap.put(1003,LocalDate.of(2012, 4, 10));
		
		System.out.println(voterList(hashMap));
		
		
		
	}

}
