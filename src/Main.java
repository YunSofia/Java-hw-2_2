public class Main {

    public static void main(String[] args) {
        int initialBalance = 100;
        int refill = 1100;
        int bonus = refill / 100;
        if (refill > 1000) {
            System.out.println("Вы получили бонус.");
        } else {
            bonus = 0;
        }
        int endBalance = initialBalance + refill + bonus;
        System.out.println(endBalance + " рублей Ваш итоговый счет.");
        System.out.println(bonus + " бонусных рублей в том числе.");
    }
}
