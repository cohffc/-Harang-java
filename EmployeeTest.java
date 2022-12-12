
public class EmployeeTest 
{

	public static void main(String[] args) 
	{
		Employee e1, e2, e3;
		
		e1 = new Employee("���϶�", 35000);
		e2 = new Employee("�ּ�ö", 50000);
		e3 = new Employee("��öȣ", 20000);
		
		int n = Employee.getCount();
		System.out.println("������ ���� �� : " + n);
	}

}

class Employee{
	private String name;
	private double salaey;
	
	static private int n = 0;
	
	public Employee(String a, double b)
	{
		this.name = a;
		this.salaey = b;
		n++;
	}
	
	public static int getCount()
	{
		return n;
	}
}
