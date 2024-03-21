package b9;

import java.util.HashMap;

public class Bai9 {
    public static void main(String[] args) {
//        khơi tạo mới
        HashMap<String, Integer> newHash = new HashMap<>();
        newHash.put("red",7);
        newHash.put("yellow",10);
        newHash.put("blue",12);
        newHash.put("white",15);
        newHash.put("black",9);
        System.out.println(newHash);
        //Kiểm tra tồn tại
        // Kiểm tra sự tồn tại của khóa “blue” trong HashMap

        boolean containsKey;
        if (newHash.containsKey("blue")) containsKey = true;
        else containsKey = false;

        System.out.println(containsKey); // Output: true

        // Kiểm tra sự tồn tại của khóa “pink” trong HashMap

        boolean nonExistingKey = newHash.containsKey("pink");

        System.out.println(nonExistingKey); // Output: false
    }
}
