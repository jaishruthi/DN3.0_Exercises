package Algorthms_Data_Structures.E_commercePlatform;

public class Product implements Comparable<Product>{
    private int productId;
    private String productName;
    private String category;
    
    @Override
    public int compareTo(Product other) {
        return Integer.compare(this.productId, other.productId);
    }
    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }
}
