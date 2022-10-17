
public class MyPoint 
{

	public static void main(String[] args) 
	{
		 int nx, ny;
		 Point p1 = new Point();
		 p1.setX("p1의 ", 3);
		 p1.setY(-5);
		 nx = p1.getX();
		 ny = p1.getY();
		 System.out.print("이동: x"+ nx + "y" + ny + "\n");
		 Point p2 = new Point();
		 p2.setX("p2의 ", -2);
		 p2.setY(6);
		 nx = p2.getX();
		 ny = p2.getY();
		 System.out.print("이동: x"+ nx + "y" + ny );
		 
	}

}

class Point
{
	int x, y;
	String n;
	
	void setX(String n, int px)
	{
		x = px;
		System.out.print(n + "초기: x" + x + " ");
	}
	
	void setY(int py)
	{
		y = py;
		System.out.print("y" + y + "\t");
	}
	
	int getX()
	{	
		x = x + y;
		return x;
	}
	
	int getY()
	{
		y = y - x;
		return y;
	}
}
