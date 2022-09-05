
public class ElectronicRemote 
{

	public static void main(String[] args) 
	{
		// 2학년들 이거 보세요
		Tv myTv1 = new Tv();
		Diswash mydis1 = new Diswash();
		
		
		myTv1.onOff = true;
		mydis1.onOff = false;
		
		myTv1.print();
		mydis1.print();
		
	}

}

class Tv
{
	boolean onOff;
	
	
	void print() 
	{
		System.err.println("TV 전원은"+ onOff + "있습니다");
	}
}

class Diswash
{
	boolean onOff;
	
	void print() 
	{
		System.err.println("식기세척기 전원은"+ onOff + "있습니다");
	}
}
