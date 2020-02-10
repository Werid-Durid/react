package Á·Ï°1;


	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Calendar;
	import java.util.Date;

	public class Á·Ï°21{
	    public static String timeToExplodeFromDate(String startDateString, int dayIterval) throws ParseException{
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	        Date startDate = dateFormat.parse(startDateString);
	        Calendar startCal = Calendar.getInstance();
	        startCal.setTime(startDate);
	        startCal.add(Calendar.DATE, dayIterval);
	        Date endDate=startCal.getTime();
	        String endDateString = dateFormat.format(endDate);
	        return endDateString;
	    }
	    
	    public static void main(String[] args) throws ParseException{
	        System.out.println(timeToExplodeFromDate("2014-11-09", 1000));
	    }
	}

