import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        1 задание
        int totalSumSpent = 0;
        for (int daySpending : arr) {
            totalSumSpent = totalSumSpent + daySpending;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Сумма трат за месяц составила " + totalSumSpent + " рублей");
//          2 задание
        int minDaySpent = arr[0];
        int maxDaySpent = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > maxDaySpent) {
                maxDaySpent = arr[i];
            }
            if (arr[i] < minDaySpent) {
                minDaySpent = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minDaySpent + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxDaySpent + " рублей");
        int arrayCount = arr.length;
//          3 задание
        double averageSum = (double) totalSumSpent / arrayCount;
        if (totalSumSpent % arrayCount == 0) {
            System.out.println("Средняя сумма трат за месяц составила " + Math.round(averageSum) + " рублей");
        } else {
            System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");
        }
//          4 задание
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            if (i == reverseFullName.length - 1) {
                System.out.print("\"");
            }
            System.out.print(reverseFullName[i]);
        }
        System.out.print("\"");
    }

    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}