package DMdev.DMdev.Week1;

/**
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию
 * на позицию Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
 * <p>
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 * <p>
 * Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
 */

public class Salary {
    public static void main(String[] args) {

        int monatlichesGehalt = 600;
        int fixCosts = 300;
        int gehaltsErhohung = 400;
        double lohnTotalFuer38Monate = 0;
        double investitionenIn38Monate = 0;

        for (int month = 1; month <= 38; month++) {

            if (month % 6 == 0) {
                System.out.println("Increase salary in month " + month);
                monatlichesGehalt += gehaltsErhohung;
            }

            double investment = monatlichesGehalt / 10;
            System.out.println("Investment in month " + investment);
            investitionenIn38Monate += investment;
            double dividenden = investment * 0.02;
            double monthRevenue = monatlichesGehalt - investment + dividenden - fixCosts;
            lohnTotalFuer38Monate += monthRevenue;

            System.out.println("Salary in " + month + " month is: " + monthRevenue);
        }

        System.out.println("Verdienst über 38 Monate: " + lohnTotalFuer38Monate);
        System.out.println("Investiert in 38 Monate: " + investitionenIn38Monate);
    }
}
