import java.util.Scanner;

public class ScanneExam2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.nextLine(); //줄바꿈 전까지 일어 반환
		String str = scanner.nextLine();
		
		System.out.println("num 값:" + num);
		System.out.println("str 값:" + str);
	}
}
