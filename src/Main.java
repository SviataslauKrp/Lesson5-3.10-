
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    final static String delimiter = "=========================";

    public static void main(String[] args) {

        dz1();
        dz2();
        dz3();
        dz4();

    }

    private static void dz1() {

        System.out.println("""
                1. Создать трехмерный массив из целых чисел.
                С помощью циклов "пройти" по всему массиву и увеличить каждый
                элемент на заданное число. Пусть число, на которое будет
                увеличиваться каждый элемент, задается из консоли.""");

        Scanner console = new Scanner(System.in);

        while (!console.hasNextInt()) {
            System.out.println("Введите корректное число");
            console.next();
        }
        int incr = console.nextInt();
        console.close();
        final int size = 3;

        int[][][] array = new int[size][size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = (int) (Math.random() * 10);
                    System.out.print(array[i][j][k] + "\t");
                }
                System.out.print("||\t");
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += incr;
                    System.out.print(array[i][j][k] + "\t");
                }
                System.out.print("||\t");
            }
        }
        System.out.println(delimiter);
    }

    private static void dz2() {

        System.out.println("""
                2. Шахматная доска
                Создать программу для раскраски шахматной доски с помощью цикла.
                Создать двумерный массив String'ов 8х8. С помощью циклов задать
                элементам циклам значения B(Black) или W(White). Результат работы
                программы:
                W B W B W B W B
                B W B W B W B W
                W B W B W B W B
                B W B W B W B W
                W B W B W B W B
                B W B W B W B W
                W B W B W B W B
                B W B W B W B W""");

        System.out.println(delimiter + "\nResult:");
        String[][] chessBoard = new String[8][8];
        final String black = "B";
        final String white = "W";

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                if (i % 2 == 0) {
                    chessBoard[i][j] = j % 2 == 0 ? white : black;

                } else {
                    chessBoard[i][j] = j % 2 == 0 ? black : white;

                }
                System.out.print(chessBoard[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println(delimiter);
    }

    private static void dz3() {

        System.out.println("3. Создайте двумерный массив целых чисел. Выведите на консоль сумму\n" +
                "всех элементов массива.");

        int[][] array = new int[3][3];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                sum += array[i][j];
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println("summa = " + sum);
        System.out.println(delimiter);
    }

    private static void dz4() {

        System.out.println("4. Создайте двумерный массив целых чисел. Отсортируйте элементы в\n" +
                "строках двумерного массива по возрастанию.");

        int[][] array = new int[3][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("source: ");
        System.out.println(Arrays.deepToString(array));
        for (int[] ints : array) {
            Arrays.sort(ints);
        }
        System.out.println("sorted: ");
        System.out.println(Arrays.deepToString(array));
        System.out.printf(delimiter);
    }
}