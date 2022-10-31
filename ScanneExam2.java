import java.util.Scanner;

public class ScanneExam2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.nextLine(); //줄바꿈 전까지 일어 반환
		String str = scanner.nextLine();
		
		System.out.println("num 값:" + num);
		System.out.println("str 값:" + str);
		
		
		System.out.print("정수 값 입력:");
		int num1 = scanner.nextInt();
		System.out.print("실수 값 입력:");
		double num2 = scanner.nextDouble();
		System.out.println("정수 값:" + num1 + ("\n실수 값 입력 :") + num2);
		
	}
}
