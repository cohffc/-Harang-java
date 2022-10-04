public class PlayShape 
{

	public static void main(String[] args) 
	{
		Square square1 = new Square();
		square1.setSize("Shape1", 40,40,40);
		Square square2 = new Square();
		square2.setSize("Shape2",105,77,12);
		Square square3 = new Square();
		square3.setSize("Shape3",92,92,48);
	}

}

class Square
{
	String type;
	int width;
	int length;
	int heigth;
	
	void setSize( String t, int w, int l, int h)
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
		System.out.println("사각형"+type+"의 면적:" + width * length + "cm2");
		
	}
	
	void countVolume()
	{
		System.out.println("사각형"+type+"의 부피:" + width * length * heigth + "cm3\n");
	}
}
