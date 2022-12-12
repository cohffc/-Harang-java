
public class StudentTest 
{

	public static void main(String[] args) 
	{
		Student kim = new Student();
		kim.ShowPrint("조하랑", 2);
		Student jang = new Student();
		jang.ShowPrint("홍길동", 2);
		Student bak = new Student();
		bak.ShowPrint("나자비", 2);
		
	}

}

class Student
{
	Student(){}
	
	static String school = "인천정보과학고등학교";
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
		System.out.println("Student의school:"+school+", name=" +name+", grade=" + grade);
	}
}
