package Uge9.Book1;

public class MainBook {
    public static void main(String[] args) {
        Book book=new Book();

        book.setTitle("pele");
        book.setAuthor("gg");
        book.setPrice(67);

        book.applyDiscount(20);
        System.out.println(book.getAuthor());
        System.out.println(book.getPrice());
        System.out.println(book.getTitle());
    }
}
