class Box{
	int width;
	int length;
	int height;
	
	Box(int w, int l){
		width =w;
		length =l;
		countBox();
	}
	
	
	Box(int w, int l, int h){
		width =w;
		length =l;
		height =h;
		countBox();
	}
	void countBox(){
		System.out.println("넓이 "+width*length+","+"\t"+("부피 "+width*length*height));
	}
}





public class TestBox {

	public static void main(String[] args) {
		System.out.println("square1상자 계산");
		Box square1=new Box(4,44);
		
		System.out.println("square2상자 계산");
		Box square2=new Box(4,34,7);

	}

}
