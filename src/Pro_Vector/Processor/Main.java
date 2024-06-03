
package Pro_Vector.Processor;
import Collection.Product;
import java.util.*;

public class Main {

    public static void InputAllProduct(Vector<Product> products, int n) {
        Scanner sc = new Scanner(System.in);
        Product p = new Product();
        for(int i = 0; i < n; i++) {
            p.input();
            products.add(p);
        }
    }

    public static void outputAllProduct(Vector<Product> products) {
        for(Product p : products) {
            System.out.println(p);
        }
    }

    /// Search to get product index.
    public static int search(Vector<Product> products) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product Code : ");
        int code = sc.nextInt();
        for(int i = 0; i < products.size(); ++i) {
            if(products.get(i).getCode() == code) return i;
        }
        return -1;
    }

    /// Update Product
    public static void updateProduct(Vector<Product> products) {
        int index = search(products);
        if(index != -1) {
            Product p = new Product();
            p.input();
            products.set(index, p);
        }else {
            System.out.println("Product not found");
        }
    }


    public static void deleteProduct(Vector<Product> products) {
        int index = search(products);
        if(index != -1) {
            products.remove(index);
            System.out.println("Product deleted successfully");
        } else {
            System.out.println("Product not found");
        }
    }
//
//
//    public static void sortProducts(Vector<Product> products) {
//
//    }


    public static void Menu() {
        System.out.println("=================[ Menu ]=================");
        System.out.println("1.Input\n2.Output\n3.Update\n4.Delete\n5.Sort\n6.Exit");
        System.out.println("===========================================");
    }

    // Check Invalid.
    public static boolean isInvalid(int option) {
        return option < 1 || option > 6;
    }


    public static void ProDuctManager() {
        Vector<Product> products = new Vector<>();
        Scanner sc = new Scanner(System.in);

        int option;
        do {
            Menu();
            do {
                System.out.println("Select an option: ");
                option = sc.nextInt();
                if(isInvalid(option)) {
                    System.out.println("Invalid option. Please try again:");
                }
            } while(isInvalid(option));

            // ..
            switch(option) {
                // input n product case:
                case 1: {
                    System.out.println("How many products do you want to add?: ");
                    int n = sc.nextInt();
                    InputAllProduct(products, n);
                }break;

                // Output all product.
                case 2: {
                    outputAllProduct(products);
                }break;

                // Update product by product code.
                case 3: {
                    updateProduct(products);
                }break;

                // Delete product
                case 4: {
                    deleteProduct(products);
                }break;

                // Sort Product by product price.
                case 5: {
                    Collections.sort(products);
                }break;

                default:
                    throw new IllegalStateException("Unexpected value: " + option);
            }
        } while(option != 6);
    }

    public static void main(String[] args) {
        ProDuctManager();
    }
}
