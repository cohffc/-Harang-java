
public class StudentTest 
{

	public static void main(String[] args) 
	{
		Student kim = new Student();
		kim.ShowPrint("���϶�", 2);
		Student jang = new Student();
		jang.ShowPrint("ȫ�浿", 2);
		Student bak = new Student();
		bak.ShowPrint("���ں�", 2);
		
	}

}

class Student
{
	Student(){}
	
	static String school = "��õ�������а���б�";
	String name;
	int grade;
	
	void ShowPrint(String a, int d)
	{
		name = a;
		grade = d;
		ShowPrint();
	}
	
	void ShowPrint()
	{
		System.out.println("Student��school:"+school+", name=" +name+", grade=" + grade);
	}
}
