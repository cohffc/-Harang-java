import java.util.Scanner;
import java.lang.StringBuffer;



public class StringMethodloov 
{

	public static void main(String[] args) 
	{
		int n1, n2;
		String str, st1;
		
		
		System.out.println("3개의 단어 이상으로 구성된 문자열을 입력하세요");
		Scanner scanner = new Scanner(System.in);
				str= scanner.nextLine();
		
				
		System.out.println("[문자열 역순 변환]");
			StringBuffer sb1 = new StringBuffer(str);
			StringBuffer sb2 = null;
			System.out.println("문자열 역순 반환 결과:ㅣ" + (sb1.reverse()) + "\n");
			
		System.out.println("[문자열 치환 반환]");
		System.out.println("[문자열 시작위치 입력]");
				n1 = scanner.nextInt();
		System.out.println("[문자열 종료위치 입력]");
				n2 = scanner.nextInt();
				st1 = "ABCDEFG";
				
		System.out.println("치완 문자열 : " + st1);
			System.out.println("완성 문자열 : " + (sb1.replace(n1,n2, st1)));
		System.out.println("str");
	}
	

}
