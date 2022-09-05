
public class Square1 
{

	public static void main(String[] args) 
	{
		Operation1 squ1 = new Operation1();
		Operation1 squ2 = new Operation1();
		Operation1 squ3 = new Operation1();
		
		
		squ1.width = 40;
		squ1.length = 40;
		squ1.heigth = 40;
		
		squ2.width = 105;
		squ2.length = 77;
		squ2.heigth = 12;
		
		squ3.width = 92;
		squ3.length = 92;
		squ3.heigth = 48;
		
		squ1.showPrint();
		squ2.showPrint();
		squ3.showPrint();
		
		
	}
	void counArea()
	{
		
	}
	
	void countVolume()
	{
		
	}
	
	

}


class Operation1
{
	int width;
	int length;
	int heigth;
	
	
	int area;
	int volume;
	
	void showPrint()
	{
		area = width * length ;
		volume = width * length * heigth;
		
		System.out.println("사각형 면적" + area + "cm2");
		System.out.println("사각형 부피" + volume + "cm3");
	}
	
	
}