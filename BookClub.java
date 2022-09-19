class Member {
    String name;
    String phone;
    String add;
    String book1;
    String book2;
    
    Member() {
        
    }
    void showPrint()
    {
        System.out.println("�̸� : " + name);
        System.out.println("��ȭ��ȣ : " + phone);
        System.out.println("�ּ� : " + add);
        System.out.println("���⵵���� : " + book1 + ", " + book2);
    }
}
public class BookClub {

    public static void main(String[] args) {
        Member st1 = new Member();
        Member st2 = new Member();
        Member st3 = new Member();
        
        
        st1.name = "�ڹٴ�";
        st1.phone  = "010-1234-1234";
        st1.add = "��õ�� ������";
        st1.book1 = "��� �ڹٴ� ó������";
        st1.book2 = "�ڹ��� ����";
        
        st2.name = "���α׷��ִ�";
        st2.phone  = "010-5678-5678";
        st2.add = "��õ�� ����Ȧ��";
        st2.book1 = "�ʺ��ڸ� ���� JAVA";
        st2.book2 = "����� �ڹ�";

        st3.name = "������";
        st3.phone  = "010-9874-3696";
        st3.add = "��õ�� ����";
        st3.book1 = "�׸����� ���� �ڹ�";
        st3.book2 = "�ȳ� �ڹ�";
        
        st1.showPrint();
        System.out.println();
        st2.showPrint();
        System.out.println();
        st3.showPrint();
    }

}
