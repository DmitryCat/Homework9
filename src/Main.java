public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    // Задание 1
    public static void task1() {
        int[] arr = generateRandomArray();
        int summ = 0;
        for (int salary : arr) {
            summ += salary;
        }
        System.out.println("Зарплата " + summ);
    }

    // задание 2
    public static void task2() {
        int[] arr = generateRandomArray();
        int max = arr[0];
        for (int salary : arr) {
            if (salary > max) {
                max = salary;
            }
        }
        int min = arr[0];
        for (int salary : arr) {
            if (salary < min) {
                min = salary;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }

    // Задание 3
    public static void task3() {
        int[] arr = generateRandomArray();
        double middle = 0;
        for (int salary : arr) {
            middle += salary;
        }
        System.out.println("Средняя сумма трат за месяц составила " + middle / arr.length);
    }
    // Задание 4
    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i] + " ");
        }
    }
}
