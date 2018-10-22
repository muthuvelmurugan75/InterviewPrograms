package bean;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Quantler_tech {

		public static void main(String[] args) {
			Scanner obj =new Scanner(System.in);

String c;
ArrayList al=new ArrayList();
int a=0,t=0;

			do {
				
				System.out.println("enter the value");
				 c=obj.next();
				 if(c.equals("q")){

						System.out.println("Largest number"+t); 

break;

	

				 }
				 
				 else{
					 
					  a=Integer.parseInt(c);
					 
if(a>t){
	t=a;

}
					//System.out.println(a); 
				 }


			} while (c!="q");
		}
	}


