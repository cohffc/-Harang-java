class Goods
{
    String name;
    int price;
    int numberOfStock;
    int sold;
    
    Goods() {
        
    }
    void showPrint() {
        System.out.println("��ǰ �̸� : " + name);
        System.out.println("��ǰ ���� : " + price);
        System.out.println("�Ǹ� ���� : " + sold);
        System.out.println("��� ���� : " + countStock());
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
