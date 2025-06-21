/*
Big O Notation Explanation:

Big O describes how the runtime of an algorithm increases as the input size grows.

Linear Search:
- Best Case: O(1)
- Average Case: O(n)
- Worst Case: O(n)

Binary Search:
- Best Case: O(1)
- Average Case: O(log n)
- Worst Case: O(log n)

Binary search is more efficient for large, sorted datasets.
*/
import java.util.Arrays;
import java.util.Comparator;

public class SearchFunction {

    // Linear Search
    public static Product linearSearch(Product[] list, String targetName) {
        for (Product p : list) {
            if (p.productName.equalsIgnoreCase(targetName)) {
                return p;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] sortedList, String targetName) {
        int low = 0;
        int high = sortedList.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int result = targetName.compareToIgnoreCase(sortedList[mid].productName);

            if (result == 0) return sortedList[mid];
            else if (result > 0) low = mid + 1;
            else high = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Sneakers", "Footwear"),
            new Product(3, "Phone", "Electronics"),
            new Product(4, "Notebook", "Stationery"),
            new Product(5, "T-shirt", "Apparel")
        };

        System.out.println("Linear Search Result:");
        Product result1 = linearSearch(products, "Phone");
        if (result1 != null) result1.showInfo();
        else System.out.println("Product not found.");

        Arrays.sort(products, Comparator.comparing(p -> p.productName));

        System.out.println("\nBinary Search Result:");
        Product result2 = binarySearch(products, "Phone");
        if (result2 != null) result2.showInfo();
        else System.out.println("Product not found.");
    }
}
