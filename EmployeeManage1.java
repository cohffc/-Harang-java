
public class EmployeeManage1 
{

	public static void main(String[] args) 
	{
		Employee1 mem1 = new Employee1();
		Employee1 mem2 = new Employee1();
		Employee1 mem3 = new Employee1();
		
		 
		mem1.name = "����";
		mem1.id = 1004;
		mem1.publicNO = "000101-2123456";
		mem1.bank = "��õ";
		mem1.bankNo = "010-011-236987";
		
		mem2.name = "�̻��";
		mem2.id = 3419;
		mem2.publicNO = "040817-2156987";
		mem2.bank = "����";
		mem2.bankNo = "789654-01-0017";
		
		mem3.name = "����ǥ";
		mem3.id = 4012;
		mem3.publicNO = "050311-2456789";
		mem3.bank = "����";
		mem3.bankNo = "2563-114-258-32147";
		
		
		mem1.showPrint();
		mem2.showPrint();
		mem3.showPrint();
	
		
	
		
	}

}


class Employee1
{
	Employee1() {}
	
	String name;
	int id;
	String publicNO;
	long salary;
	String bank;
	String bankNo;
	
	void showPrint()
	{
		
		System.out.println("�� �� ��" + name);
		System.out.println("��� ID" + id);
		System.out.println("�ֹι�ȣ" + publicNO);
		System.out.println("���� ����" + countSalary() + "����");
		System.out.println("�� �� ��" + bank + "��");
		System.out.println("���¹�ȣ" + bankNo);
		System.out.println("==========================");
		
	}
	
	long countSalary()
	{
		long s;
		s = 3000 - (id * 4);
		return (s);
	}
	
	
	
	
	
	
}
