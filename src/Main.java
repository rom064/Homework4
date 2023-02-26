import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 13;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия, нужно немного подождать.");
        }
        System.out.println(" ");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 6;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }
        System.out.println(" ");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 33;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " , то можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф.");
        }
        System.out.println(" ");
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 10;
        if (age >= 2 && age < 7) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        }
        if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете.");
        }
        if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
        }
        System.out.println(" ");
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 15;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        }
        if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
        System.out.println(" ");
    }

    public static void task6() {
        System.out.println("Задача 6");
        int oneCar = 102;
        int seating = 60;
        int human = 55;
        if (human <= seating && human <= oneCar) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (human > seating && human <= oneCar) {
            System.out.println("В вагоне есть только стоячие места");
        }
        if (human > oneCar) {
            System.out.println("В вагоне нет свободных мест");
        }
        System.out.println(" ");
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 3;
        int two = 15;
        int three = 7;
        if (one > two && one > three) {
            System.out.println("Большее число one = " + one);
        }
        if (two > one && two > three) {
            System.out.println("Большее число two = " + two);
        }
        if (three > one && three > two) {
            System.out.println("Большее число three = " + three);
        }

    }


}