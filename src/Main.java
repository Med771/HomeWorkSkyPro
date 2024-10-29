public class Main {
    public static void main(String[] args) {
        // I will create: firstName, middleName, lastName, and after I create fullName.
        // It will make it easier to do the 1st and 2nd task
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        String fullName = firstName + " " + middleName + " " + lastName;

        // task 1
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        //task 2
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        //task 3
        fullName = "Иванов Семён Семёнович";

        System.out.println("Данные Ф. И. О. сотрудника — " + fullName.replaceAll("ё", "е"));
    }
}
