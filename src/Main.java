public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] dailyPayments = generateRandomArray();
        int sum = 0;
        for(int i : dailyPayments) {
            System.out.print(i+" "); //Вывод массива в консоль.
        }
        System.out.println();
        for(int k : dailyPayments) {
            sum += k;
        }
        System.out.println("Сумма всех выплат за месяц равна: "+sum+" рублей.");
    }

    public static void task2() {
        int[] dailyPayments = generateRandomArray();
        int maxPayment = -1;
        int minPayment = dailyPayments[0];
        for(int i : dailyPayments) {
            System.out.print(i+" "); //Вывод массива в консоль.
        }
        for(int k : dailyPayments) {
            if (k > maxPayment) {
                maxPayment = k;
            }
            if (k < minPayment) {
                minPayment = k;
            }
        }
        System.out.println();
        System.out.println("Минимальная сумма трат за день составила "+minPayment+" рублей.");
        System.out.println("Максимальная сумма трат за день составила "+maxPayment+" рублей.");
    }

    public static void task3() {
        int[] dailyPayments = generateRandomArray();
        double averagePayments;
        int sum = 0;
        for(int i : dailyPayments) {
            System.out.print(i+" "); //Вывод массива в консоль.
        }
        for(int k : dailyPayments) {
            sum += k;
        }
        System.out.println();
        averagePayments = (double) sum / dailyPayments.length;
        System.out.println("Средняя сумма трат за месяц составила "+averagePayments+" рублей.");
    }

    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for(int i=reverseFullName.length-1; i>=0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
    public static void task5() {
        //Создайте матрицу 3х3 (двумерный массив типа int).
        //Заполните единицами обе диагонали матрицы и напечатайте ее в консоль.
        int[][] matrix = new int[3][3];
        int k = matrix.length - 1;
        for(int i=0; i< matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][k] = 1;
            k--;
        }
        for (int [] row : matrix) {
            for (int elem : row)      //Печатаем матрицу в консоль
                System.out.printf("%2d",elem);
            System.out.println();
        }
    }
}