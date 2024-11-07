import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // task 1
        task1();
        System.out.println();

        // task 2
        task2();
        System.out.println();

        // task 3
        task3();
        System.out.println();

        // task 4
        task4();
    }

    public static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        for (Integer num : nums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2() {
        HashMap<Integer, Boolean> d = new HashMap<>();

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        for (Integer num : nums) {
            if (num % 2 == 0) {
                if (!d.containsKey(num)) {
                    d.put(num, true);
                }
                else {
                    d.put(num, false);
                }
            }
        }

        for (Integer num: d.keySet()) {
            if (d.get(num)) {
                System.out.println(num);
            }
        }
    }

    public static void task3() {
        HashMap<String, Boolean> d = new HashMap<>();

        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

        for (String string : strings) {
            if (d.containsKey(string)) {
                d.put(string, false);
            }
            else {
                d.put(string, true);
            }
        }

        for (String string : d.keySet()) {
            if (d.get(string)) {
                System.out.println(string);
            }
        }
    }

    public static void task4() {
        HashMap<String, Integer> counter = new HashMap<>();

        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

        for (String string : strings) {
            counter.put(string, counter.getOrDefault(string, 0) + 1);
        }

        for (Integer counterValue : counter.values()) {
            System.out.println(counterValue);
        }
    }
}