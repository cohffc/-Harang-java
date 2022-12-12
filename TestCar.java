
public class TestCar 
{

	public static void main(String[] args) 
	{
		Car car1 = new Car();
		car1.setCar(1234, 20.5);
		car1.showPrint();
		
		System.out.println("차량 번호가 변경되었습니다");
		car1.setCar();
		car1.showPrint(2345);
		
		System.out.println("연료향만 변경되었습니다");
		car1.setCar(30.5);
		car1.showPrint();
		
	}

}

class Car
{
	
	private int num;
	private double gas;
	
	Car(){}
	
	public void setCar(int a, double b)
	{
		num = a;
		gas = b;
		System.out.println("차량번호를" + num + "로, 연료 양을" +gas+ "로 바꾸엇습니다");
		System.out.println("차량번호는" + num + "입니다");
		System.out.println("연료 양은" + gas + "입니다");
	}
	
	void setCar(){}
	
	public void showPrint(int a) {		
		num = a;
		System.out.println("차량번호를" + num + "로 바꾸었습니다");
		System.out.println("차량번호는" + num + "입니다");
		System.out.println("연료 양은" + gas + "입니다");
	}
	
	public void setCar(double b){
		gas = b;
		System.out.println("연료 양을" + gas + "로 바꾸었습니다");
		System.out.println("차량번호는" + num + "입니다");
		System.out.println("연료 양은" + gas + "입니다");
	}
	
	void showPrint() {}
}	
