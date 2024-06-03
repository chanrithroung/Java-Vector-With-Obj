package Collection;
import java.util.*;
// import package.*; // it mean import all class on the package.

public class Product implements Comparable<Product>{
    // Product Data
    private int code;
    private String name;
    private float price;
    public Product() {
        this.code = 0;
        this.name = "";
        this.price = 0;
    }
    public Product(int code, String name, float price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }



    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product code: "); code = sc.nextInt(); sc.nextLine();
        System.out.print("Enter product name: "); name = sc.nextLine();
        System.out.print("Enter product price: "); price = sc.nextFloat();
    }

    @Override
    public int compareTo(Product product) {
        return Float.compare(this.price, product.price);

    }
    public int getCode() {
        return this.code;
    }
    public void setCode(int code) {
        this.code = code;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String toString() {
        return code + "\t" + name + "\t" + price;
    }

}
