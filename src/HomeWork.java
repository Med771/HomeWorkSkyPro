public class HomeWork {
    public static void main(String[] args) {
        // task 1
        isLeapYear(2024);

        // task 2
        getUrlDownloadApp(1, 2023, 2015);

        // task 3
        int days = getDayByDistance(95);

        System.out.println(days);
    }

    public static void isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year +" год является високосным");
            return;
        }

        System.out.println(year + " год не является високосным");
    }

    public static void getUrlDownloadApp(int clientDeviceOS, int clientDeviceYear, int updateYear) {

        if (clientDeviceOS == 0 && updateYear <= clientDeviceYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            return;
        }
        if (clientDeviceOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            return;
        }

        if (clientDeviceOS == 1 && updateYear <= clientDeviceYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
            return;
        }

        System.out.println("Установите облегченную версию приложения для Android по ссылке");
    }

    public static int getDayByDistance(int deliveryDistance ) {
        if (deliveryDistance < 20) {
            return 1;
        }
        if (deliveryDistance < 60) {
            return 2;
        }
        if (deliveryDistance < 100) {
            return 3;
        }

        return 0;
    }
}
