package b14;

import java.util.Comparator;
import java.util.TreeMap;

public class Bai14 {
    public static void main(String[] args) {
        //Khởi tạo treemap
        TreeMap<String,Integer> treeMap = new TreeMap<>(Comparator.reverseOrder());

        treeMap.put("apple", 1);
        treeMap.put("banana", 2);
        treeMap.put("cherry", 3);
        treeMap.put("date", 4);
        treeMap.put("elderberry", 5);
        //in ra các phần tử
        for (var entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }
}
