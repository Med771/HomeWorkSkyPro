public class Main {
    public static void main(String[] args) {
        //Output an empty string to separate tasks
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
    }

    public static void task1() {
        // We record other age for if
        byte clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        // We record other age for if
        short clientDeviceYear = 2015;
        byte clientOS = 0;

        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        // We record other age for if
        short year = 2021;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        // We record other age for if
        byte deliveryDistance = 95;
        byte days = 0;

        if (deliveryDistance < 20) {
            days += 1;
        } else if (deliveryDistance < 60) {
            days += 2;
        } else if (deliveryDistance < 100) {
            days += 3;
        }

        if (deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
    }

    public static void task5() {
        // We record other age for if
        byte monthNumber = 12;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                break;
        }
    }
}