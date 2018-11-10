package LL;

import java.util.Scanner;

public class Reminder_for_particular_Days_before{



	public static void main(String[] args) {
		int arr[]={31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner obj=new Scanner(System.in);
		int month=obj.nextInt()-1;

		int date=obj.nextInt();


		int s=0,r=0;
		for(int i=0;i<month;i++){
		s=s+arr[i];
		}
		int sample=s+date-20;
		System.out.println("sample=="+sample);

	


int c=0;

int t=0,m=1,b=1;
for(int k=0;k<arr.length;k++){
	
	t=t+arr[k];
	
	for(int d=0;d<arr[k];d++)
{
		c++;

if(c==sample){
	m=m+k;
System.out.println("month=="+m);
b=b+d;
System.out.println("date=="+b);
}

	}
	
}


/*
int result=1;
for(int j=0;j<arr.length;j++){
	for(int k=0;k<arr[j];k++){
		result=result+k;
		if(result==sample){
			System.out.println("result"+arr[k]);
			
		}
		
	}
}
*/



	}

}
