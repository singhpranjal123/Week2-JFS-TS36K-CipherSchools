import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {

        ArrayList <Product> products = new ArrayList<Product>();
        Product p = new Product();
        p.title= "X-Men";
        p.price = 333;
        products.add(p);
        System.out.println(p.toString());
    }
}
class Product{
    String title;
     int price;
    public String toString(){
        return title + " and " + price;
    }
}
