package lab8;
import java.util.Date;

class Exercise2 implements Runnable{
	
	public void run() {
	while(true) {
	   	try {
	   		Date d=new Date();
	   		System.out.println(d);
	   		Thread.sleep(10000);	   	
	   		}catch(InterruptedException e) {
	   		e.printStackTrace();
	   	}
	  }
 }
}
public class Lab8Ex2 {

	public static void main(String[]args) {
       Exercise2 t=new Exercise2();
       Thread tr=new Thread(t);
       tr.start();
	}
}
