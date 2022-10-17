
public class OpderOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
	}
}
