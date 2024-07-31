package Algorthms_Data_Structures.E_commercePlatform;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[] {
            new Product(1, "Apple iPhone", "Electronics"),
            new Product(2, "Samsung TV", "Electronics"),
            new Product(3, "Nike Shoes", "Fashion"),
            //...
        };

        int targetProductId = 2;

        
        int linearSearchIndex = LinearSearch.search(products, targetProductId);
        if (linearSearchIndex != -1) {
            System.out.println("Product found at index " + linearSearchIndex + " using linear search");
        } else {
            System.out.println("Product not found using linear search");
        }


       Arrays.sort(products, Comparator.comparingInt(Product::getProductId));
       
       
        int binarySearchIndex = BinarySearch.search(products, targetProductId);
        if (binarySearchIndex != -1) {
            System.out.println("Product found at index " + binarySearchIndex + " using binary search");
        } else {
            System.out.println("Product not found using binary search");
        }
    }
}