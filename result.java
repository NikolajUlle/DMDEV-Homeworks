package DMdev.Week1;
/**3 переменные:
        - operand1 (double)
        - operand2 (double)
        - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
 Написать функцию, которая принимает в качестве параметров
        эти три переменные и возвращает результат операции.
        Протестировать функцию в main.
 Например:
        Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
        Результат: 34.5 (24.4 + 10.1)
*/
public class result {
    public static void main(String[] args) {
        double operand1 = 24.4;
        double operand2 = 10.1;

        System.out.println(" Result is : " + result(operand1, operand2));
    }

    private static double result(double operand1, double operand2) {
        double result = operand1 + operand2;
        return result;
    }
}
