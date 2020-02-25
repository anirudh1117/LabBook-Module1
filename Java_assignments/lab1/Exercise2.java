package lab1;

import java.util.Scanner;

public class Exercise2 {

	public int calculateDifference(int n) {
		int sum1=0,sum2=0;
		for(int i=1;i<=n;i++) {
			sum1=sum1+i*i;
			sum2=sum2+i;
			
		}
		int sum=Math.abs(sum1-sum2);
		return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise2 obj=new Exercise2();
	      Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();
	      int res=obj.calculateDifference(n);
	      System.out.println(res);
	}

}
