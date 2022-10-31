import java.util.Scanner;;

public class Point2Point 
{

	public static void main(String[] args) 
	{
		int x,y,x1,y1;
		double distamce;
		Scanner scan = new Scanner(System.in);
		System.out.println("한 지점(x, y)를 입력 받아 (x,y)와 (x1,y1)의 거리를 계산하는 프로그램입니다.");
		
		System.out.println("첫 번째 위치의 x좌표를 입력하세요 ");
			x = scan.nextInt();
		System.out.println("첫 번째 위치의 y좌표를 입력하세요 ");
			y = scan.nextInt();
		System.out.println("첫 번째 위치의 x1좌표를 입력하세요 ");
			x1 = scan.nextInt();		
		System.out.println("첫 번째 위치의 y1좌표를 입력하세요 ");
			y1 = scan.nextInt();
			
		LinkPoint di1 = new LinkPoint();
			di1.setPoint(x, y, x1, y1);
			distamce = di1.geDistance();
		System.out.println("두 지점의 거리 : " + distamce);
	}

}

class LinkPoint
{
	int x,y,x1,y1;
	
	LinkPoint() {}
	
	void setPoint(int x,int y,int x1,int y1)
	{
		this.x = x;
		this.y = y;
		this.x1 = x1;
		this.y1 = y1;
	}
	
	double geDistance()
	{
		double k1 = Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
		return(k1);
	}
}
