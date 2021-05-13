public class Main {
    public static void main(String[] args) {
        int balance = 258;
        int refill = 1015;
        int bonusRubles;
        int totalBalance;

        if (refill > 1000) {
            bonusRubles = refill / 100;
        } else {
            bonusRubles = 0;
        }
        totalBalance = balance + refill + bonusRubles;
        System.out.println("Итоговая сумма на счету клиента: " + totalBalance + " рублей");
        System.out.println("Бонус составил: " + bonusRubles + " рублей");
    }
}
