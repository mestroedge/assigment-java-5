
public class leapyr {
public static void main (String args[])
{
	int year = (int)(Math.random()*10000);
	if (year>999 && year<9999)
	{
		if(year % 4 == 0)
		{
			System.out.println(year+" is leap year");
		}
		else
		{
			System.out.println(year+" is not leap year");
		}
	}
	else
	{
	System.out.println("year is not valid");
    }
  }
}


