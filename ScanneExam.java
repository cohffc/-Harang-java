import java.util.Scanner;//패키지는 자바개발환경에서 제공하는 클래스 라이브러리로 관련 클래스 & 인터페이스 모임
						 //import java.util.* 로가능하다
public class ScanneExam 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in); //스캐너 객체 생성, 객체명
		String name = scanner.next(); //키보드로 입력받은 string을 토큰다위로 반환
		String gender = scanner.next(); //토큰 : Spacebar,Tab, Enter 등으로 구분되는 요소
		int AdmissionYear = scanner.nextInt(); //키보드로 입력받은 DATA를 int형으로 반환
		double gradeGoal = scanner.nextDouble(); //키보드로 입력받은 DATA를 double형으로 반환
		System.out.println(name + gender + AdmissionYear + gradeGoal);
	}

}
