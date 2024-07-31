package Algorthms_Data_Structures.E_commercePlatform;

public class LinearSearch {
    public static int search(Product[] products, int targetProductId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductId() == targetProductId) {
                return i;
            }
        }
        return -1; 
    }
}