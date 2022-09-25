package DMdev.DMdev.Week1;

/**
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число,
 * а возвращать количество четных цифр (вторая функция - нечетных).
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */
public class Numbers {
    public static void main(String[] args) {
        int numberToTest = 228910;

        System.out.println("Anzahl der geraden Zahlen: " + evenNumbersCounter2(numberToTest));
        System.out.println("Alle ungeraden Zahlen:" + unevenNumbersCounter(numberToTest));
    }

    static int evenNumbersCounter2(int number) {
        int counter = 0;

        for (int i = 0; i <= number; i++) {
            int test = i % 2;
            if (test == 0) {
                counter++;
            }
        }

        return counter;
    }

    public static int unevenNumbersCounter(int number) {
        int counter = 0;
        for (int i = 0; i <= number; i++) {
            int value = i % 2;
            if (value != 0) {
                counter++;
            }

        }
        return counter;
    }

}


