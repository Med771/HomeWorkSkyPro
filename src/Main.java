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

    }

    public static void task1() {
        short months = 0;
        int account = 0;

        while (account < 2459000) {
            account += 15000;
            months++;

            System.out.println("Месяц " + months + ", сумма накоплений равна " + account + " рублей");
        }
    }

    public static void task2() {
        byte i = 1;

        while (i <= 10) {
            System.out.print(i + " ");

            i++;
        }

        System.out.println();

        for (i = 10; i >= 1; i--){
            System.out.print(i + " ");
        }

        System.out.println();
    }

    public static void task3() {
        int population = 12_000_000;

        for (int i = 1; i < 11; i++) {
            population += population / 1000 * 9;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        int account = 15000;
        short months = 1;

        while (account < 12_000_000) {
            System.out.println("Месяц " + months + ", сумма накоплений равна " + account + " рублей");

            months++;
            account += (int) (account * 0.07);
        }

        System.out.println("Месяц " + months + ", сумма накоплений равна " + account + " рублей");
    }

    public static void task5() {
        int account = 15000;
        short months = 1;

        while (account < 12_000_000) {
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ", сумма накоплений равна " + account + " рублей");
            }

            months++;
            account += (int) (account * 0.07);
        }

        System.out.println("Месяц " + months + ", сумма накоплений равна " + account + " рублей");
    }

    public static void task6() {
        int account = 15000;
        short months = 1;

        for (int i = 0; i < 55; i++) {
            if (i % 6 == 0) {
                System.out.println("Месяц " + months + ", сумма накоплений равна " + account + " рублей");
            }

            months++;
            account += (int) (account * 0.07);
        }

        System.out.println("Месяц " + months + ", сумма накоплений равна " + account + " рублей");
    }

    public static void task7() {
        int fridayNumber = 4;

        while (fridayNumber <= 31) {
            System.out.println("Сегодня пятница, " + fridayNumber + "-е число. Необходимо подготовить отчет");

            fridayNumber += 7;
        }
    }

    public static void task8() {
        int currentYear = 2024;

        for (int i = currentYear - 200; i < currentYear + 101; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}
