package server;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.ParseException;
public class Add_delete_date{
   public static void main(String args[]){

	String oldDate = "2017-01-31";  
	System.out.println("Date before delete: "+oldDate);

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Calendar c = Calendar.getInstance();
	try{
	   //Setting the date to the given date
	   c.setTime(sdf.parse(oldDate));
	}catch(ParseException e){
		e.printStackTrace();
	 }
	   
	//Number of Days to add
	c.add(Calendar.DAY_OF_MONTH, -7);  
	//Date after adding the days to the given date
	String newDate = sdf.format(c.getTime());  
	//Displaying the new Date after addition of Days
	System.out.println("Date after Addition: "+newDate);
   }
}