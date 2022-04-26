public class Main {
    public static void main(String[] args) {

        int bonus = 20;        // Размер за одну милю
        int ticket = 6930;    // Цена билета
        int summaBonus = ticket/bonus;    // Размер бонусов за билетов

        System.out.println("Размер суммы ваших бонусных баллов за покупку равен  " + summaBonus);  // Вывод суммы бонусов
    }
}