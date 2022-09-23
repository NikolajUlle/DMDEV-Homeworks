package DMdev.Week1;
    /**
        В переменной minutes лежит число от 0 до 59.
        Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
         в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).

        Протестировать функцию в main.
         */


import java.util.Scanner;

public class Minuten {
    public static void main(String[] args) {
        System.out.println(" Enter a minute");
        Scanner console = new Scanner(System.in);
        int minutes = console.nextInt();
        quarter(minutes);
    }

    private static void quarter(int minutes) {
        if (minutes >= 0 && minutes <= 15) {
            System.out.println(" 1 Quarter");
        } else if (minutes >= 16 && minutes <= 30) {
            System.out.println(" 2 Quarter ");
        } else if (minutes >= 31 && minutes <= 45) {
            System.out.println("3 Quarter");
        } else if (minutes >= 46 && minutes <= 59) {
            System.out.println(" 4 Quarter");
        }
    }

}
