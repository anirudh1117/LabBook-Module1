package lab1;

import java.util.Scanner;

public class Exercise4 {

	public boolean checkNumber(int n){
		 if(n==0)
			 return false;
		 else
		 {
			 while(n!=1) {
				 if(n%2!=0) {
					 return false;
				 }
					 n=n/2;
				 }
			 return true;
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exercise4 obj=new Exercise4();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean res=obj.checkNumber(n);
		System.out.println(res );
	}

}
