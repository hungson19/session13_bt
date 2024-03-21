package b13;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Bai13 {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        // khơi tạo mảng giá trị ngẫu nhiên
        Random random = new Random();
        int[] array = new int[100];
        //mỗi phần tử trong mảng tạo ra một số ngẫu nhiên
        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(50);
        }

        for (int i = 1; i < array.length; i++) {
            treeMap.put(array[i],0);
        }
        System.out.println(treeMap);

        // Lấy giá trị của phần tử nhỏ nhất trong TreeMap bằng cách sử dụng phương thức firstEntry()
        Map.Entry<Integer, Integer> minTree = treeMap.firstEntry();
        System.out.println(minTree);


    }



}
