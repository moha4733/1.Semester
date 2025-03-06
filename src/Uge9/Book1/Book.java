package Uge9.Book1;

public class Book {
    private String title;
    private String author;
    private double price;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void applyDiscount(double percentage){
        double discountamount= (price * percentage)/100;
        price-=discountamount;
    }
}
