package DMdev.Week1;

/**Даны два прямоугольных треугольника. Каждый из них задается двумя целочисленными
        переменными a и b - стороны треугольника.
        Написать код, в котором вычисляется площадь каждого треугольника и затем
        эти площади сравниваются друг с другом.
        Для этого понадобится написать 2 функции.
        Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
        Вторая: сравнивает переданные площади двух треугольников и выводит на консоль
        первый треугольник больше, меньше или равен второму.
        Учитывать, что площадь может быть вещественным числом.
*/

public class DreieckVergleich {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c = 10;
        int d = 10;

        double area1 = areaOfRightTriangle(a, b);
        double area2 = areaOfRightTriangle(c, d);
        System.out.println("Area of right triangle 1 is:" + area1);
        System.out.println("Area of right triangle 2 is:" + area2);
        areasComparison(area1, area2);
    }

    public static double areaOfRightTriangle(double x, double y) {
        double area = (x * y) / 2;
        return area;
    }

    public static void areasComparison(double area1, double area2) {
        if (area1 > area2) {
            System.out.println("Area1 " + area1 + " more then " + " Area2 " + area2);
        } else if (area1 == area2) {
            System.out.println("Area1 " + area1 + " = " + " Area2 " + area2);
        } else {
            System.out.println("Area1 " + area1 + " less then " + " Area2 " + area2);
        }


    }
}















