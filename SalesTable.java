class Goods
{
    String name;
    int price;
    int numberOfStock;
    int sold;
    
    Goods() {
        
    }
    void showPrint() {
        System.out.println("상품명 : " + name);
        System.out.println("가격 : " + price);
        System.out.println("상품 보유 수량 : " + sold);
        System.out.println("상품 매출액 : " + countStock());
    }
    int countStock() {
        return numberOfStock - sold;
    }
}
public class SalesTable {

    public static void main(String[] args) {
        Goods cam1 = new Goods();
        Goods cam2 = new Goods();
        
        cam1.name = "Nikcon";
        cam1.price = 400000;
        cam1.sold = 30;
        cam1.numberOfStock = 50;
        
        cam2.name = "Canon";
        cam2.price = 430000;
        cam2.sold = 41;
        cam2.numberOfStock = 75;
        
        cam1.showPrint();
        System.out.println();
        cam2.showPrint();
        
    }

}
