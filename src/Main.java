public class Main {
    public static void main(String[] args) {
        // Output an empty string to separate tasks
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
        System.out.println();

        // task 5
        task5();
        System.out.println();

        // task 6
        task6();
        System.out.println();

        // task 7
        task7();
        System.out.println();

        // task 8
        task8();
        System.out.println();

        // task 9
        task9();
        System.out.println();

        // task 10
        task10();
        System.out.println();
    }

    public static void task1() {
        for (byte i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        for (byte i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void task3() {
        for (byte i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        for (byte i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    public static void task5() {
        for (short i = 1904; i <= 2096; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void task6() {
        for (byte i = 7; i < 99; i += 7) {
            System.out.println(i);
        }
    }

    public static void task7() {
        short i = 1;

        for (; i < 513; i *= 2) {
            System.out.println(i);
        }
    }

    public static void task8() {
        for (int i = 1; i <= 12; i++) {
            System.out.println("Месяц " + i + ", сумма накоплений равна " + (i * 29000) + " рублей");
        }
    }

    public static void task9() {
        int account = 40000;
        int cumulativePercentage = account / 100;

        for (int i = 1; i <= 12; i++) {
            account += cumulativePercentage;

            System.out.println("Месяц " + i + ", сумма накоплений равна " + account + " рублей");
        }
    }

    public static void task10() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2 * i));
        }
    }
}
