
public class TestCar 
{

	public static void main(String[] args) 
	{
		Care car1 = new Care();
		car1.setCar(1234, 20.5);
		car1.showPrint();
		
		System.out.println("���� ��ȣ�� ����Ǿ����ϴ�");
		car1.setCar();
		car1.showPrint(2345);
		
		System.out.println("�����⸸ ����Ǿ����ϴ�");
		car1.setCar(30.5);
		car1.showPrint();
		
	}

}

class Care
{
	
	private int num;
	private double gas;
	
	Care(){}
	
	public void setCar(int a, double b)
	{
		num = a;
		gas = b;
		System.out.println("������ȣ��" + num + "��, ���� ����" +gas+ "�� �ٲپ����ϴ�");
	}
	
	void setCar(){}
	
	public void showPrint(int a) {		
		num = a;
		System.out.println("������ȣ��" + num + "�� �ٲپ����ϴ�");
	}
	
	public void setCar(double b){
		gas = b;
		System.out.println("������ȣ��" + num + "�Դϴ�");
		System.out.println("���� ����" + gas + "�Դϴ�");
	}
	
	void showPrint() {}
}	
