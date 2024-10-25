public class Main {
    public static void main(String[] args) {
        // task 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // task 2

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // task 3

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // task 4

        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        // task 5

        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

        // task 6

        var massFirstBoxer = 78.2;
        var massSecondBoxer = 82.7;
        var sumMass = massFirstBoxer + massSecondBoxer;
        var massDifference = massSecondBoxer - massFirstBoxer;

        System.out.println(sumMass);
        System.out.println(massDifference);

        // task 7

        var remainder = massFirstBoxer % massSecondBoxer;
        System.out.println(remainder);

        // task 8.1

        var totalWorkingTime = 640;
        var employeeTime = 8;

        var numberOfEmployees = totalWorkingTime / employeeTime;
        System.out.println("Всего работников в компании — " + numberOfEmployees + " человек");

        // task 8.2

        var newNumberOfEmployees = numberOfEmployees + 94;
        var newEmployeeTime = totalWorkingTime / newNumberOfEmployees;

        System.out.println("Если в компании работает " + newNumberOfEmployees + " человек, то всего " + newEmployeeTime + " часов работы может быть поделено между сотрудниками");
    }
}
