public class Main {
    public static void main(String[] args) {
        // I used one array for all tasks
        int[] expenditure = {502323, 83923, 98298, 21928, 28398};

        // task 1
        int totalExpenditure = 0;

        for (int waste: expenditure) {
            totalExpenditure += waste;
        }

        System.out.println("Сумма трат за месяц составила " + totalExpenditure + " рублей");

        // task 2
        int minExpenditure = expenditure[0];
        int maxExpenditure = expenditure[0];

        for (int i = 1; i < expenditure.length; i++) {
            if (expenditure[i] < minExpenditure) {
                minExpenditure = expenditure[i];
            }
            if (expenditure[i] > maxExpenditure) {
                maxExpenditure = expenditure[i];
            }
        }

        System.out.println("Минимальная сумма трат за неделю составила " + minExpenditure + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + maxExpenditure + " рублей");

        // task 3
        // We already have totalExpenditure, so we will perform the calculations at once
        float averageSpend = (float) (totalExpenditure / expenditure.length);

        System.out.println("Средняя сумма трат за месяц составила " + averageSpend + " рублей");

        // task 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
