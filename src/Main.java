import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int totalSumSpent = 0;
        for (int daySpending : arr) {
            totalSumSpent = totalSumSpent + daySpending;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Сумма трат за месяц составила " + totalSumSpent + " рублей");
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