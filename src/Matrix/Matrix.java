package Matrix;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        matrix3x3();
    }

    public static void matrix3x3() {
        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[3][3];
        int sum = 0;
        int diagonal = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Enter matrix element " + i + "x" + j + ":");
                matrix[i][j] = sc.nextInt();
                sum += matrix[i][j];
                if( i == j) {
                    diagonal += matrix[i][j];
                }
            }
        }

        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Addition: " + sum);
        System.out.println();
        System.out.println("Diagonal: " + diagonal);
    }
}
