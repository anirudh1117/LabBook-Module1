package lab1;

import java.util.Scanner;

public class Exercise3 {

	public boolean checkNumber(int number) {
		String s=Integer.toString(number);
		char c;
		boolean flag=false;
		for(int i=0;i<s.length()-1;i++)
		{
			c=s.charAt(i);
			if(c>s.charAt(i+1)) {
				flag=true;
				break;
			}
		}
		if(flag==true)
			return false;
		else
			return true;
	}
	
	public static void main(String args[]) {
		Exercise3 obj=new Exercise3();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean res=obj.checkNumber(n);
		System.out.println(res);
	}
	
	
	
}
