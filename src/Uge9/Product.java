package Uge9;

public class Product {
    private String productName;
    private String productCode;
    private double price;




    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName=productName;
    }
    public String getProductCode(){
        return productCode;
    }
    public void setProductCode(String productCode){
        this.productCode=productCode;
    }
    public double getPrice(){
        return getPrice();
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void applyDiscount(double percentage){
        double discountamount= (price * percentage)/100;
        price-=discountamount;
    }
}
