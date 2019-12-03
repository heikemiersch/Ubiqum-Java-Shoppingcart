import java.util.ArrayList;
import java.util.List;

public class Shoppingcart {

    private int totalPrice;
    private int amount;
    private List<Product> productsTotal = new ArrayList<>();

    public Shoppingcart() {
        this.amount = amount;
        this.totalPrice = totalPrice;
    }

    public int getAmount() {return amount;}
    public void setAmount(int amount) {this.amount = amount;}

    public void addProduct(Product product) {
        productsTotal.add(product);
    }

    public List<Product> getProductsTotal() {
        return productsTotal;
    }

    public void getTotalPrice() {
        for (int i = 0; i < this.productsTotal.length; i++) {
            this.totalPrice += this.productsTotal[i].price;
        }
        if (this.productsTotal.length >= 5) {
            return "total price is " + (this.totalPrice / 10) * 9 + " €";
        } else {
            return "total price is " + this.totalPrice + " €";
        }
    }

}
