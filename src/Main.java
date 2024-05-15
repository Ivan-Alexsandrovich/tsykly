public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");

        }
        System.out.println(

        );
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i <= 17; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println();

        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 1; i < 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        {
            int deposit = 29000;
            int sum = 0;
            for (int i = 1; i <= 12; i++) {
                sum += deposit;
                System.out.println("Месяц  " + i + ", сумма накоплений равна  " + sum + "  рублей.");

            }
        }
        System.out.println();
        double deposit = 29000;
        double sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum = sum + (sum * 0.01) + deposit;
            System.out.println("Месяц  " + i + ", сумма накоплений равна  " + sum + "  рублей».");


        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2 * i));

        }


    }
}