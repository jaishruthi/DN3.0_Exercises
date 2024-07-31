package Algorthms_Data_Structures.E_commercePlatform;

import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static int search(Product[] products, int targetProductId) {
        Arrays.sort(products, Comparator.comparingInt(Product::getProductId));
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (products[mid].getProductId() == targetProductId) {
                return mid;
            } else if (products[mid].getProductId() < targetProductId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; 
    }
}
