
public class ElectronicRemote 
{

	public static void main(String[] args) 
	{
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
		System.err.println("TV ������"+ onOff + "�ֽ��ϴ�");
	}
}

class Diswash
{
	boolean onOff;
	
	void print() 
	{
		System.err.println("�ı⼼ô�� ������"+ onOff + "�ֽ��ϴ�");
	}
}
