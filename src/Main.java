public class Main {
    public static void main(String[] args) {
        //Output an empty string to separate tasks
        // task 1
        task1();
        System.out.println();

        // task 2
        task2();

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
    }

    public static void task1() {
        byte module = 1;
        short price = 30000;
        int id = 1358678678;
        long stars = 1222333444555666777L;
        float percent = 0.125F;
        double pi = 3.14159265358979323846D;

        System.out.println("Значение переменной module с типом byte равно " + module);
        System.out.println("Значение переменной price с типом short равно " + price);
        System.out.println("Значение переменной id с типом int равно " + id);
        System.out.println("Значение переменной stars с типом long равно " + stars);
        System.out.println("Значение переменной percent с типом float равно " + percent);
        System.out.println("Значение переменной pi с типом double равно " + pi);
    }

    public static void task2() {
        float num1 = 27.12F;
        long num2 = 987_678_965_549L;
        float num3 = 2.786F;
        short num4 = 569;
        short num5 = -159;
        short num6 = 27897;
        byte num7 = 67;
    }

    public static void task3() {
        byte firstNumberOfStudents = 23;
        byte secondNumberOfStudents = 27;
        byte thirdNumberOfStudents = 30;

        byte totalStudents = (byte) (firstNumberOfStudents + secondNumberOfStudents + thirdNumberOfStudents);

        short papers = 480;

        byte papersPerStudent = (byte) (papers / totalStudents);

        System.out.println("На каждого ученика рассчитано " + papersPerStudent + " листов бумаги.");
    }

    public static void task4() {
        // I record the power of the machine, reducing everything to a minute, for easy half-reading
        byte machinePerformance = 16 / 2;

        // power per 20 minutes
        short firstPower = (short) (20 * machinePerformance);
        System.out.println("За 20 минут машина произвела " + firstPower + " штук бутылок");

        // power per day
        short secondPower = (short) (1440 * machinePerformance);
        System.out.println("За 24 часа машина произвела " + secondPower + " штук бутылок");

        // power per 3 days
        int thirdPower = 3 * 1440 * machinePerformance;
        System.out.println("За 3 дня машина произвела " + thirdPower + " штук бутылок");

        // power per month (30 days)
        int fourthPower = 30 * 1440 * machinePerformance;
        System.out.println("За 1 месяц машина произвела " + fourthPower + " штук бутылок");
    }

    public static void task5() {
        byte amountOfWhitePaintPerClass = 2;
        byte amountOfBrownPaintPerClass = 4;

        byte amountOfPaintsPerClass = (byte) (amountOfBrownPaintPerClass + amountOfWhitePaintPerClass);

        byte totalAmountOfPaint = 120;

        byte amountClasses = (byte) (totalAmountOfPaint / amountOfPaintsPerClass);

        byte amountOfWhitePaint = (byte) (amountClasses * amountOfWhitePaintPerClass);
        byte amountOfBrownPaint = (byte) (amountClasses * amountOfBrownPaintPerClass);

        System.out.println("В школе, где " + amountClasses + " классов, нужно " + amountOfWhitePaint + " банок белой краски и " + amountOfBrownPaint + " банок коричневой краски");
    }

    public static void task6() {
        // Weight Ingredients
        byte weightOfBanana = 80;
        byte weightOfMilk = 105;
        byte weightOfIceCream = 100;
        byte weightOfEggs = 70;

        byte amountOfBanana = 5;
        byte amountOfMilk = 2;
        byte amountOfIceCream = 2;
        byte amountOfEggs = 4;

        short totalWeightBanana = (short) (weightOfBanana * amountOfBanana);
        short totalWeightMilk = (short) (weightOfMilk * amountOfMilk);
        short totalWeightOfIceCream = (short) (weightOfIceCream * amountOfIceCream);
        short totalWeightEggs = (short) (weightOfEggs * amountOfEggs);

        float totalWeightBreakfastInGrams = (short) (totalWeightBanana + totalWeightMilk + totalWeightOfIceCream + totalWeightEggs);
        float totalWeightBreakfastInKilograms = totalWeightBreakfastInGrams / 1000;

        System.out.println((short) totalWeightBreakfastInGrams + " грамм");
        System.out.println(totalWeightBreakfastInKilograms + " килограмм");
    }

    public static void task7() {
        short minimumLossInGrams = 250;
        short maximumLossIGrams = 500;

        byte weightToLoseInKilograms = 7;
        short weightToLoseInGrams = (short) (weightToLoseInKilograms * 1000);

        byte minimumDaysToLoseWeight = (byte) (weightToLoseInGrams / minimumLossInGrams);
        byte maximumDaysToLoseWeight = (byte) (weightToLoseInGrams / maximumLossIGrams);

        byte mediumDaysToLoseWeight = (byte) ((maximumDaysToLoseWeight + minimumDaysToLoseWeight) / 2);

        System.out.println("Минимально для похудения нужно " + minimumDaysToLoseWeight + " дней");
        System.out.println("Максисально для похудения нужно " + maximumDaysToLoseWeight + " дней");
        System.out.println("В среднем для похудения нужно " + mediumDaysToLoseWeight + " дней");
    }

    public static void task8() {
        float upliftFactor = 1.1F;

        int currentSalaryForMasha = 67760;
        int currentSalaryForDenis = 83690;
        int currentSalaryForKristina = 76230;

        int newSalaryForMasha = (int) (upliftFactor * currentSalaryForMasha);
        int newSalaryForDenis = (int) (upliftFactor * currentSalaryForDenis);
        int newSalaryForKristina = (int) (upliftFactor * currentSalaryForKristina);

        short differenceSalaryForMasha = (short) (newSalaryForMasha - currentSalaryForMasha);
        short differenceSalaryForDenis = (short) (newSalaryForDenis - currentSalaryForDenis);
        short differenceSalaryForKristina = (short) (newSalaryForKristina - currentSalaryForKristina);

        System.out.println("Маша теперь получает " + newSalaryForMasha + " рублей. Годовой доход вырос на " + differenceSalaryForMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryForDenis + " рублей. Годовой доход вырос на " + differenceSalaryForDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryForKristina + " рублей. Годовой доход вырос на " + differenceSalaryForKristina + " рублей");


    }
}
