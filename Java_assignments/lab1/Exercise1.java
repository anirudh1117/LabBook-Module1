package lab1;

import java.util.Scanner;

public class Exercise1 {

	public int calculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			
			if(i%3==0 || i%5==0) {
				sum=sum+i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Exercise1 obj=new Exercise1();
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int res=obj.calculateSum(n);
      System.out.println(res);
      
	}

}
