package DMdev.DMdev.Week1;

/**
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 * <p>
 * Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
 */
public class OppositeValue {
    public static void main(String[] args) {
        System.out.println("Opposite number = " + convertNumberToOppositeValue(4700));
    }

    static int convertNumberToOppositeValue(int numberToConvert) {
        int oppositeNumber = 0;

        do {
            int num = numberToConvert % 10;
            oppositeNumber = oppositeNumber * 10 + num;
        } while ((numberToConvert /= 10) != 0);

        return oppositeNumber;
    }
}
