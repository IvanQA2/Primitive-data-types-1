public class Main {
    public static void main(String[] args) {
        int score = 100;
        int deposit_amount = 900;
        int bonus;
        int amount;
        if (deposit_amount >= 1000) {
            bonus = deposit_amount / 100;
            amount = bonus + score + deposit_amount;
            System.out.println("Бонус равен: " + bonus);
            System.out.println("Итоговая сумма на счету клиента: " + amount);
        } else {
            System.out.println("Бонусов нет.");
            amount = score + deposit_amount;
            System.out.println("Итоговая сумма на счету клиента: " + amount);
        }
    }
}