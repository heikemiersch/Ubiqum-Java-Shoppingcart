public class Product {

    private String name;
    private int price;

    public Product (String name, int price, int amount){
        this.name = name;
        this.price = price;
    }

    public String getName() {return name;}
    public int getPrice() {return price;}

    public void setName(String name) {this.name = name;}
    public void setPrice(int price) {this.price = price;}

    public String toString() {
        return this.name + " " + this.price + "€";
    }

}