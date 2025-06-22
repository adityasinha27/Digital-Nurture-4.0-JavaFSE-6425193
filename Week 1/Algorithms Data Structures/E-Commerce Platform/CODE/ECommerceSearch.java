import java.util.*;

class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public String toString() {
        return "[" + productId + "] " + productName + " - " + category;
    }
}

public class ECommerceSearch {

    public static Product linearSearch(Product[] products, String name) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String name) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int compare = products[mid].productName.compareToIgnoreCase(name);
            if (compare == 0) return products[mid];
            if (compare < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Phone", "Electronics"),
            new Product(102, "Book", "Education"),
            new Product(103, "Shoes", "Fashion")
        };

        System.out.println("Linear Search for Phone:");
        Product result1 = linearSearch(products, "Phone");
        System.out.println(result1 != null ? result1 : "Product not found");

        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        System.out.println("Binary Search for Phone:");
        Product result2 = binarySearch(products, "Phone");
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}

