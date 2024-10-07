package day9;

public class switchcasestatements {

	public static void main(String[] args) 
	{
		int dayofWeek=3;
		String dayName;
		
		switch(dayofWeek) 
		{
		case 1:
			dayName = "monday";
		break;
		
		case 2:
			dayName = "tuesday";
		break;
			
		case 3:
			dayName = "wednesday";
		break;
			
		default:
			dayName = ("Unkown");
		}
		System.out.println(dayName);
		
			

	}

}
