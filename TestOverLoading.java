
public class TestOverLoading {

	public static void main(String[] args) {
		OverLoading obj1 = new OverLoading();
		
		obj1.abc();
		obj1.abc(33);
		obj1.abc(33.3);
		obj1.abc(44,55);
		//int val = obj1.abc(44,55);
		
		obj1.abc(66,77.7);
		obj1.abc(77.7,66);
		obj1.abc("메소드 오버로딩");
	}

}
class OverLoading
{
	OverLoading(){}
	
	void abc()
	{
		System.out.println("매개변수에 전달된 값 x");
	}
	
	void abc(int a)
	{
		System.out.println("매개변수a에 전달된 값" + a);
	}
	
	void abc(double a)
	{
		System.out.println("매개변수a에 전달된 값" + a);
	}
	void abc(int a, int b)
	{
		System.out.println("매개변수a와 b에 전달된 값 :"+ a+","+b);
	}
//	int abc(int c, int d)
//	{
//		System.out.println("매개변수c와 d에 전달된 값 :"+ c+","+d);
//		return c+d;
//	}
	void abc(int a, double b)
	{
		System.out.println("매개변수a와 b에 전달된 값 :"+ a+","+b);
	}
	void abc(double a, int b)
	{
		System.out.println("매개변수a와 b에 전달된 값 :"+ a+","+b);
	}
	void abc(String w)
	{
		System.out.println("매개변수w에 전달된 값 x" + w);
	}
//	void abc(String a)
//	{
//		System.out.println("문자열 매개변수a에 전달된 값" + a);
//	}
	
}
