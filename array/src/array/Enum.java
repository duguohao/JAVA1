package array;

import java.util.Calendar;

import array.Enum.Week;

public class Enum {

	
	public enum Week{
		
		MONDAY,
		TUESDAY,
		WEDNESDAY, 
		THURSDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new enum2();

	}
	
	}
	class enum2 extends Enum {
		public enum2() {
			Week today=null;
			Calendar cal=Calendar.getInstance();
			int week=cal.get(Calendar.DAY_OF_WEEK);
			switch(week) {
			case 1:
				today=Week.MONDAY;
				break;
			case 2:
				today=Week.TUESDAY;
				break;
			case 3:
				today=Week.WEDNESDAY;
				break;
			case 4:
				today=Week.THURSDAY;
				break;
			case 5:
				today=Week.FRIDAY;
				break;
			case 6:
				today=Week.SATURDAY;
				break;
			case 7:
				today=Week.SUNDAY;
				break;
			}
			System.out.println(today);
			if(today==Week.SUNDAY){
				System.out.println("1");
		      }
			else{
				System.out.println("2");
			}
			
		}
	}

	      
		
		
		
	
	

