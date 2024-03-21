package b11;

import java.util.Arrays;
import java.util.Random;
import java.util.TreeMap;

public class Bai11 {
    public static void main(String[] args) {
        // Mảng các phần tử nguyên
        Random random = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(arr));

        //  Khai báo một đối tượng TreeMap để lưu trữ các phần tử trong mảng
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        // Sử dụng vòng lặp để đưa các phần tử của mảng vào TreeMap
        for (int num : arr) {
            treeMap.put(num, 0);
        }

        // In ra các phần tử trong TreeMap (đã được sắp xếp theo thứ tự tăng dần của khóa)
        System.out.println("Các phần tử trong TreeMap:");
        for (int key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }
    }
}
