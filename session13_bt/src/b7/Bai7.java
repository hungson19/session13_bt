package b7;

import java.util.HashMap;

public class Bai7 {
    public static void main(String[] args) {
//        khai báo hashmap gốc
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Nga",300000);
        hashMap.put("Kien",150000);
        hashMap.put("Thao",110000);
        hashMap.put("Mai",30000);
        hashMap.put("Do",350000);
//        khai báo một hashmap mới
        HashMap<String, Integer> newHash = new HashMap<>();
//        sao chép
        newHash.putAll(hashMap);

        System.out.println("HashMap gốc:");
        System.out.println(hashMap);
        System.out.println("HashMap mới sao chép:");
        System.out.println(newHash);
    }
}
