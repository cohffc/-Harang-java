
public class CarTest 
{

	public static void main(String[] args) 
	{
		Car car1 = new Car("S600", "white", 80);
        Car car2 = new Car("E500", "blue", 20);

        System.out.println("지금까지 생성된 자동차 수 = " + Car.n);
	}

}

class Car
{
	Car(){}
	
	
	static int n = 0;
	private int id;
	private String model;
	private String color;
	private int speed;
	
	public Car(String a, String b, int c)
	{
		model = a;
		color = b;
		speed = c;
		id = n++;
	}
}
