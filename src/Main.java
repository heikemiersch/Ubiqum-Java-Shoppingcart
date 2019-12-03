public class Main {
    public static void main (String[] args) {

        Product p1 = new Product("vacuum cleaner", 100,  0);
        Product p2 = new Product("pencil", 3, 0);
        Product p3 = new Product("bike", 300, 0);
        Product p4 = new Product("shoes", 45, 0);
        Product p5 = new Product("hoodie", 30, 0);

        Shoppingcart cart = new Shoppingcart ();

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);
        cart.addProduct(p4);
        cart.addProduct(p5);
        cart.addProduct(p5);
        cart.addProduct(p5);

        System.out.println(p1.getName() + " costs " + p1.getPrice() + " euros");
        System.out.println("cart contains " + cart.getProductsTotal());
    }
}
