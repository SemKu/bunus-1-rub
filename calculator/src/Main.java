public class Main {
    public static void main(String[] args) {
        int initialBalance = 200;
        int replenishmentAmount = 2_000;
        int percent = replenishmentAmount / 100;
        int bonus;
        if (replenishmentAmount >= 1_000) {
            bonus = percent;
        } else {
            bonus = 0;
        }
        int balans = initialBalance + replenishmentAmount + bonus;
        System.out.println(balans);

    }
}
