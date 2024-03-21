package b3.presentation;


import b3.business.Iproduct.ProductManager;
import b3.business.config.InputMethods;

public class Main {
    public static void main(String[] args) {
        ProductManager product = new ProductManager();
        byte choice;
        do {
            System.out.println("-------------MENU-------------\n" +
                    "1.Thêm sản phẩm\n" +
                    "2.Sửa thông tin sản phẩm theo id\n" +
                    "3.Xóa sản phẩm theo id\n" +
                    "4.Hiển thị danh sách sản phẩm\n" +
                    "5.Tìm kiếm sản phẩm theo tên\n" +
                    "6.Sắp xếp sản phẩm tăng dần, giảm dần theo giá\n" +
                    "Chon tác vụ");
            choice = InputMethods.getByte();
            switch (choice){
                case 1:
                    product.createProduct();
                    break;
                case 2:
                    product.editProduct();
                    break;
                case 3:
                    product.deleteProduct();
                    break;
                case 4:
                    product.displayProduct();
                    break;
                case 5:
                    product.searchProduct();
                    break;
                case 6:
                    product.sortProduct();
                    break;
                default:
                    System.out.println("Moi ban nhap lai");
                    break;
            }
        }
        while (choice!=7);
    }
}