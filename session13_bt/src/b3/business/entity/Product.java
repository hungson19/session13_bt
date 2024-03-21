package b3.business.entity;

public class Product {
    private static int count = 0;
    private int idProduct;
    private String nameProduct;
    private int Price;

    public Product() {
    }

    public Product( String nameProduct, int price) {
        this.idProduct = count++;
        this.nameProduct = nameProduct;
        Price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }


    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", Price=" + Price +
                '}';
    }
}
