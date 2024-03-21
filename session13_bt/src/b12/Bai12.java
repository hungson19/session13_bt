package b12;
import java.util.*;

public class Bai12 {
    public static void main(String[] args) {
        // Khai báo và khởi tạo một mảng các số nguyên ngaãu nhiên
        Random random = new Random();
        int[] array = new int[100];
        // với mỗi phần tử trong mảng tạo ra một số ngẫu nhiên
        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));

        // Khai báo một đối tượng TreeMap để lưu trữ các phần tử trong mảng
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        // Sử dụng vòng lặp để đưa các phần tử của mảng vào TreeMap với giá trị là 0
        for (int number : array) {
            treeMap.put(number, 0);
        }

        // Lấy giá trị của phần tử lớn nhất trong TreeMap
        int max = treeMap.lastKey();
        System.out.println("Giá trị của phần tử lớn nhất trong TreeMap: " + max);

        //  Xóa phần tử lớn nhất
        treeMap.remove(max);

        // Lấy phần tử lớn thứ hai bằng cách lấy phần tử lớn nhất trong TreeMap sau khi xóa
        int secondMax = treeMap.lastKey();
        System.out.println("Phần tử lớn thứ hai là: " + secondMax + " | Số phần tử lớn thứ hai là: " + treeMap.get(secondMax));
    }
}
