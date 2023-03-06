package Ques8;

public class Test {
    public static void main(String[] args) {
        Book book1;
        PaperBackBook book2;
        book1=new Book();
        book2 =new PaperBackBook();
        book1.decription();
        book2.decription();
        book2.putPageMarker(10);
    }
}
