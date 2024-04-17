public abstract class Product {
    protected int barcode;
    protected String name;
    protected String brand;
    public static int productCount=0;
    public Product() {
        this.barcode =1+100*productCount;
        productCount++;
    }
}
