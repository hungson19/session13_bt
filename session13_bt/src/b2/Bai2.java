package b2;

import java.util.*;

public class Bai2 {
    public static void main(String[] args) {
        //  Khai báo mảng chứa các phần tử
        int[] arr = {1, 2, 3, 4, 5, 3, 4, 5, 6, 7};

        // B2: Khởi tạo HashMap để lưu trữ các phần tử duy nhất và số lần xuất hiện của mỗi phần tử
        Map<Integer, Integer> map = new HashMap<>();

        // Duyệt từng phần tử trong mảng và kiểm tra xem phần tử đó đã có trong HashMap hay chưa
        for (int number : arr) {
            // Nếu đã có thì tăng giá trị tương ứng với phần tử lên 1
            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
            } else {
                // Nếu chưa có thì thêm phần tử vào HashMap với giá trị ban đầu là 1
                map.put(number, 1);
            }
        }

        //  Duyệt qua các phần tử trong HashMap,lưu trữ các phần tử có giá trị bằng 1 vào một mảng mới
        List<Integer> uniqueElements = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueElements.add(entry.getKey());
            }
        }

        // In ra các phần tử duy nhất
        System.out.println("Các phần tử duy nhất:");
        for (int num : uniqueElements) {
            System.out.println(num);
        }
    }
}

