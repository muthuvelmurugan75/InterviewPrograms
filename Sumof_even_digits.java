package g;
import java.io.*;
public class Sumof_even_digits
{
public static void main(String args[])throws IOException
   {
	
	int t=12823;
	int r=0,s=0;

	while(t>0){
		r=t%10;
		if(r%2==0)
			s=s+r;
			t=t/10;
		
	}
System.out.println(s);

   }
}