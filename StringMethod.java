import java.lang.String;

public class StringMethod 
{

	public static void main(String[] args) 
	{
		String  st1 = "상수형식으로 문자열 선언";
		String  st2 = "상수형식으로 문자열 선언";
		String  st3 = new String("객제생성으로 문자열 선언");
		String  st4 = new String("객제생성으로 문자열 선언");
		
		
		
		
		System.out.println("문자열 위치(주소) & 내용 비교");
			System.out.println("st1 VS st2 주소 : " + (st1 == st2));
			System.out.println("st3 VS st4 주소 : " + (st3 == st4));
			System.out.println("st1 VS st3 주소 : " + (st1 == st3));
			System.out.println("st2 VS st4 주소 : " + (st2 == st4));
			System.out.println("st1 VS st2 주소 : " + (st1.equals(st2)));
			System.out.println("st3 VS st4 주소 : " + (st3.equals(st4)));
			System.out.println("st1 VS st3 주소 : " + (st1.equals(st3)));
			System.out.println("st2 VS st4 주소 : " + (st2.equals(st4)));
			System.out.println( );
			
	}

}
