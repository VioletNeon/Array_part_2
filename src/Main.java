import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Task-1
        short[] weeklyPaymentAmounts = {15_000, 17_000, 19_000, 12_000, 23_000};
        int sum = 0;

        for (short item : weeklyPaymentAmounts) {
            sum += item;
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // Task-2
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

        // Task-3
        float[] weeklyExpensePerMonth = {23_011, 16_005, 12_020, 11_000, 20_100};
        float sumOfExpense = 0;

        for (float item : weeklyExpensePerMonth) {
            sumOfExpense += item;
        }

        float averageAmountSpent = sumOfExpense / weeklyExpensePerMonth.length;

        System.out.println("Средняя сумма трат за месяц составила " + averageAmountSpent + " рублей");

        // Task-4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char[] fullName = new char[reverseFullName.length];

        for (byte i = (byte) (reverseFullName.length - 1); i >= 0; i--) {
            char currentChar = reverseFullName[i];

            fullName[reverseFullName.length - i - 1] = currentChar;
            System.out.print(currentChar);
        }

        System.out.print("\n" + Arrays.toString(fullName));
    }
}