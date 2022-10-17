
public class OpderOperation {

	public static void main(String[] args) {
		int result;
		
		Operation opder1 = new Operation();
		result = opder1.chooseSymbol(13,44,'*');
		System.out.println(result);
		result = opder1.chooseSymbol(36,6,'/');
		System.out.println(result);
		result = opder1.chooseSymbol(44,36,'+');
		System.out.println(result);
		result = opder1.chooseSymbol(6,13,'-');
		System.out.println(result);

	}

}

class Operation
{
	int integer1,integer2,value;
	char symbol;
	
	int chooseSymbol(int a, int b, char c)
	{
		integer1 = a;
		integer2 = b;
		symbol = c;
		
		switch(symbol)
		{
		case '+' : value = integer1 + integer2; break;
		case '-' : value = integer1 - integer2; break;
		case '*' : value = integer1 * integer2; break;
		case '/' : value = integer1 / integer2; break;
		default : System.out.println("연산 기호가 아닙니다");
		}
		
		
		symbolMessage();
		
		return value;
	}
	
	void symbolMessage()
	{
		String st = null;
		switch(symbol)
		{
		case '+' : st = "뎃셈연산"; break;
		case '-' : st = "뻴셈연산"; break;
		case '*' : st = "곱셈연산"; break;
		case '/' : st ="니늣셈연산"; break;
		default : System.out.println("연산 기호가 아닙니다");
		}
		
		giveResult(st);

	}
	
	void giveResult(String st)
	{
		System.out.print(st + ":" + integer1 + symbol + integer2 +"=");
	}
}
