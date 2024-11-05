public class Main {
    public static void main(String[] args) {
        short[] weeklyPaymentAmounts = {15_000, 17_000, 19_000, 12_000, 23_000};
        int sum = 0;

        for (short item : weeklyPaymentAmounts) {
            sum += item;
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
}