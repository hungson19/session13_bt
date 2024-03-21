package b5;

import java.util.*;

public class Bai5 {
    public static void main(String[] args) {
//        khai báo một hashmap
        HashMap<String,Integer> hashMap = new HashMap<>();
//        đẩy vào
        hashMap.put("apple",3);
        hashMap.put("bưởi",2);
        hashMap.put("xoài",5);
        hashMap.put("dưa hấu",7);
        hashMap.put("nhãn",10);
   //tạo một danh sách
        List<Map.Entry<String, Integer>> list = new ArrayList<>(hashMap.entrySet());
//        sắp xếp
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
// in ra các phần tử sau khi sắp xếp
        System.out.println("Danh sách các phần tử sau khi sắp xếp:");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}
