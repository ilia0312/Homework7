public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1 () {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int month = 1;
        while (total < 2_459_000 ) {
            total = total + salary;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            month++;
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (; number > 0; number-- ) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birth = 17;
        int death = 8;
        int year = 0;
        int every1000IsBorn = birth - death;

        while (year < 10) {
            year++;
            population = population / 1000 * every1000IsBorn + population;
            System.out.println("Год " +year+ ", численность населения составляет " +population);
        }

    }

    public static void task4 () {
        System.out.println("Задача 4");
    }

    public static void task5 () {
        System.out.println("Задача 5");
    }

    public static void task6 () {
        System.out.println("Задача 6");
    }

    public static void task7 () {
        System.out.println("Задача 7");
    }

    public static void task8 () {
        System.out.println("Задача 8");
    }
}