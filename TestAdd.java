
public class TestAdd {

	public static void main(String[] args) 
	{
		Add obj1 = new Add();
		
		obj1.sum(1 ,0);
		obj1.sum(2 ,0);
		obj1.sum(3.0 ,0.0);
	}

}

class Add
{
	Add(){
		
	}
	
	int a,b,c, sum;
	double d,e;
	
	void sum(int a, int b)
	{
		sum = a + b;
		System.out.println("sum :" +sum);
	}
	
	void sum(int a, int b, int c)
	{
		sum = a + b + c;
		System.out.println("sum :" +sum);
	}
	
	void sum(double d, double e)
	{
		d = d + e;
		System.out.println("sum :" +d);
	}
	
//	void showProlnt()
//	{
//		System.out.println();
//	}
}
