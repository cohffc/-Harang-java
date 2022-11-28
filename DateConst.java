
public class DateConst {

	public static void main(String[] args) 
	{
		Date date1 = new Date(2022,"11월",22);
		Date date2 = new Date(2020);
		Date date3 = new Date();
		
		
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
	}

}

class Date{
	int year;
	String month;
	int day;
	
	Date()
	{
		this(1900, "1월", 1);
	}
	
	Date(int year)
	{
		this(year, "1월", 1);
	}
	
	Date(int year, String month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
@Override
	public String toString() 
	{
		return"Date[year="+ year+", month=" + month+ ", day="+day+"]";
	}
}
