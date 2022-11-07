import java.util.Scanner;

class StringMethodEx 
{
	 String str;

	 void inputString(String s) 
	 {
	    str = s;
	 }
	 void inputString(int sta, int end) 
	 {
	    System.out.println("String클래스에는 "+ sta + "번째" + "~" + end + "번째 문자 변환" + str.substring(sta, end));
	    
	 }
	 void inputString(int n) 
	 {
	    System.out.println("str 문자열"+ n + "번째 문자 반환: " + str.charAt(n));
	 }
}

public class StringMethodCall 
{
	  public static void main(String[] args) 
	  {
	      System.out.println("3개 단어 이상으로 구성된 문자열을 입력하세요 : ");
	      StringMethodEx stringmethodex = new StringMethodEx();
	      Scanner scanner = new Scanner(System.in);

	      stringmethodex.str = scanner.nextLine();
	      System.out.print("입력 문자열 길이(length)반환 : ");
	      System.out.println(stringmethodex.str.length());

	      System.out.println("몇 번째 문자를 반환할까요? ");

	      stringmethodex.inputString(scanner.nextInt());

	      System.out.println("입력 문자열 특정부분의 문자 반환");
	      System.out.println("반환 문자열의 시작위치와 종료위치 입력");
	      stringmethodex.inputString(scanner.nextInt(), scanner.nextInt());
	      
	      
	      System.out.println("");
	      System.out.println("String클래스에는 그밖에도 문자열관련 메소드가 있음.");



	   }
}
