
public class PlayShape 
{

	public static void main(String[] args) 
	{
		Square square1 = new Square();
		square1.width = 40;
		square1.length = 40;
		square1.heigth = 40;
		square1.countArea();
		square1.countVolume();
		Square square2 = new Square();
		square2.width = 105;
		square2.length = 77;
		square2.heigth = 12;
		square2.countArea();
		square2.countVolume();
		Square square3 = new Square();
		square3.width = 92;
		square3.length = 92;
		square3.heigth = 48;
		square3.countArea();
		square3.countVolume();
	}

}

class Square
{
	int type;
	int width;
	int length;
	int heigth;
	
	void setSize(int t, int w, int l, int h)
	{
		type = t;
		width = w;
		length = l;
		heigth = h;
		countArea();
		countVolume();
	}
	
	void countArea()
	{
		int i = 0;
		i = i + 1;
		type = width * length;
		System.out.println("사각형 Shape"+i+"의 면적:" + type + "cm2");
	}
	
	void countVolume()
	{
		int i = 0;
		i = i + 1;
		type = width * length * heigth;
		System.out.println("사각형 Shape"+i+"의 부피:" + type + "cm3");
		return;
	}
}
