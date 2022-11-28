
public class TestSquareM 
{

	public static void main(String[] args) 
	{

		SquareM square1 = new SquareM();
		
		square1.countBox(4,44);
		square1.countBox(4,34,7);
		
	}

}

class SquareM
{
	SquareM(){
		
	}
	
	void countBox(int width, int length )
	{
		System.out.print("출력형태:"+"넓이" + width*length+",");
	}
	
	void countBox(int width, int length, int height)
	{
		System.out.println("부피" + width*length*height);
	}
		
}
