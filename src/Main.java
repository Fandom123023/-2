public class Main {
    public static void main(String[] args) {

        System.out.println("test1");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }
        System.out.println("test2");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(i);
        }
        System.out.println("test3");
        for (int i = 0 + 2; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("test4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }
        System.out.println("test5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является высокосным ");
        }
        System.out.println("test6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("test7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("test8");
        int wages = 29000;
        int totalSavings = 0;
        for (int m = 1; m <= 12; m++) {
            totalSavings += wages;
            System.out.println("Месяц " + m + " , сумма накоплений равна " + totalSavings + " рублей ");
        }
        System.out.println("Задача 9");
        for (int i = 1, money = 0; i <= 12; i++) {
            money = (int) ((money + 29000) * 1.01);
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей %n", i, money);
        }

        System.out.println("test10");
        for (int wTwo = 2; wTwo <= 10; wTwo++) {
            System.out.println(" 2 * " + wTwo + " = " + 2 * wTwo);
        }

    }
}