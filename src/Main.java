public class Main {
    public static void main(String[] args) {
        short[] weeklyPaymentAmounts = {15_000, 17_000, 19_000, 12_000, 23_000};
        int sum = 0;

        for (short item : weeklyPaymentAmounts) {
            sum += item;
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        short[] dailyPaymentAmountsPerWeek = {11_000, 9_000, 7_000, 13_000, 8_000};
        short minWeeklyPaymentAmount = dailyPaymentAmountsPerWeek[0];
        short maxWeeklyPaymentAmount = dailyPaymentAmountsPerWeek[0];

        for (short currentDailyPaymentAmount : dailyPaymentAmountsPerWeek) {
            if (currentDailyPaymentAmount > maxWeeklyPaymentAmount) {
                maxWeeklyPaymentAmount = currentDailyPaymentAmount;
            }

            if (currentDailyPaymentAmount < minWeeklyPaymentAmount) {
                minWeeklyPaymentAmount = currentDailyPaymentAmount;
            }
        }

        System.out.println("Минимальная сумма трат за неделю составила " + minWeeklyPaymentAmount + " рублей. Максимальная сумма трат за неделю составила " + maxWeeklyPaymentAmount + " рублей");
    }
}