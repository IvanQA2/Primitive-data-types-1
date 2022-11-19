public class Main {
    public static void main(String[] args) {
        int score = 100;
        int depositAmount = 1000;
        int bonus;
        int amount;
        if (depositAmount > 1000) {
            bonus = depositAmount / 100;
            amount = bonus + score + depositAmount;
            System.out.println("Бонус равен: " + bonus);
            System.out.println("Итоговая сумма на счету клиента: " + amount);
        } else {
            System.out.println("Бонусов нет.");
            amount = score + depositAmount;
            System.out.println("Итоговая сумма на счету клиента: " + amount);
        }
    }
}