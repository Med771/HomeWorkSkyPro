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
        System.out.println();

        // task 6
        task6();
        System.out.println();

        // task 7
        task7();
    }

    public static void task1() {
        // We record other age for if
        byte age = 17;

        if (age >= 18) {
            System.out.println("Если возраст человека больше или равен " + age + ", то он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека больше или равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        // We record other age for if
        byte temperature = 4;

        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " нужно надеть шапку");
        }
        else {
            System.out.println("На улице " + temperature + " можно идти без шапки");
        }
    }

    public static void task3() {
        // We record other age for if
        byte speed = 65;

        if (speed > 60) {
            System.out.println("Если скорость " + speed + " придется заплатить штраф");
        }
        else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно");
        }
    }

    public static void task4() {
        // We record other age for if
        byte age = 17;

        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        }
        else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        }
        else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age +  ", то ему нужно ходить в университет");
        }
        else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
    }

    public static void task5() {
        // We record other age for if
        byte age = 17;

        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }
        else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении");
        }
        else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void task6() {
        // In solving the problem I decided to prioritise the seating places
        byte TotalNumberOfSeatsInCarriage = 102;
        byte NumberOfOccupiedSeatsInCarriage = 37;
        byte NumberOfSeatsInCarriage = 62;


        if (NumberOfOccupiedSeatsInCarriage < NumberOfSeatsInCarriage) {
            System.out.println("Свободны сидячие места");
        }
        else if (NumberOfOccupiedSeatsInCarriage < TotalNumberOfSeatsInCarriage) {
            System.out.println("Свободны стоячие места");
        }
        else{
            System.out.println("Не осталось мест");
        }
    }

    public static void task7() {
        int one = 5, two = 3, three = 4;

        if (one >= two && one >= three) {
            System.out.println(one);
        }
        else if (two >= three && two >= one) {
            System.out.println(two);
        }
        else {
            System.out.println(three);
        }
    }
}
