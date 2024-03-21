package b3.business.Iproduct;

import b3.business.config.InputMethods;
import b3.business.design.CRUD;
import b3.business.entity.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManager implements CRUD {
    List<Product> list = new ArrayList<>();

    // thêm mới sản phẩm
    @Override
    public void createProduct() {
        Product newProduct = new Product();
        System.out.println("Nhap ten san pham:");
        newProduct.setNameProduct(InputMethods.getString());
        System.out.println("Nhap gia san pham:");
        newProduct.setPrice(InputMethods.getInteger());
        list.add(newProduct);
    }
    //sửa thông tin sản phẩm
    @Override
    public void editProduct() {
        System.out.println("Nhap ma ID cua san pham can sua");
        int input = InputMethods.getInteger();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIdProduct()==input){// tìm thấy thì hiệnr thị thông tin sản phẩm và cho phép thay đổi thông tin
                list.get(i).toString();
                System.out.println("Nhap ten san pham:");
                list.get(i).setNameProduct(InputMethods.getString());
                System.out.println("Nhap ma ID:");
                list.get(i).setPrice(InputMethods.getInteger());
                break;
            }
            else {
                System.out.println("Khong co san pham can sua: ");// nếu ko tìm thấy thì thông báo
            }
        }
    }
    // xóa sản phẩm
    @Override
    public void deleteProduct() {
        System.out.println("Nhap ma ID cua san pham can xoa");
        int input = InputMethods.getInteger();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIdProduct()==input){// tìm thấy thì xóa băng method remove()
                list.remove(i);
                break;
            }
            else {
                System.out.println("Khong co san pham can xoa: ");
            }
        }
    }
    // hiển thị danh sách sản phẩm
    @Override
    public void displayProduct() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Ma ID: "+list.get(i).getIdProduct());
            System.out.println("Ten san pham: "+list.get(i).getNameProduct());
            System.out.println("Gia: "+list.get(i).getPrice());
            System.out.println("-------------------------------");
        }
    }
    //tìm sản phẩm
    @Override
    public void searchProduct() {
        System.out.println("Nhap ma ten cua san pham can tim");
        String input = InputMethods.getString();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNameProduct().equals(input)){// tìm thấy thì trả về thông tin sản phẩm
                list.get(i).toString();
                break;
            }
            else {
                System.out.println("Khong co san pham can tim: ");
            }
        }
    }

    @Override
    public void sortProduct() {
        if (list.isEmpty()) {
            System.out.println("Khong co san pham nap de sap xep");
        } else {
            // sắp xếp theo giá tăng dần
            Collections.sort(list, (o1, o2) -> {
                return o1.getPrice() - o2.getPrice();
            });
            // trả lại về danh sách sau sx
            displayProduct();
        }
    }


}
