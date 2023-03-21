
//Завдання 5
//Створіть два масиви 3х3, заповніть їх, створіть третій масив порожній.
//У третій масив внесіть результат додавання перших двох.
//
//Завдання 6
//Створіть два масиви 3х3, заповніть їх, створіть третій масив порожній.
//У третій масив внесіть результат додавання перших двох, використовуючи методи.

import java.util.Random;

public class Main {
    public static void main(String[] args) {


        int[][] squareArray1 = CreateSquareArray(3);
        System.out.println("\nМасив 1:");
        PrintSquareArray(squareArray1);

        int[][] squareArray2 = CreateSquareArray(3);
        System.out.println("\nМасив 2:");
        PrintSquareArray(squareArray2);


        int[][] summSquareArray = Summ2SquareArray (squareArray1, squareArray2);
        System.out.println("\nРезультат складання 2х масивів:");
        PrintSquareArray(summSquareArray);

    }

    static void PrintSquareArray(int[][] squareArray){
        for(int i = 0; i < squareArray.length; i++){
            for(int j = 0; j < squareArray[i].length; j++){
                System.out.print(squareArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] CreateSquareArray(int count){
        Random rndNumber = new Random();
        int[][] tempSquareArray = new int[count][count];

        for(int i = 0; i < tempSquareArray.length; i++){
            for(int j = 0; j < tempSquareArray[i].length; j++){
                tempSquareArray[i][j] = rndNumber.nextInt(1, 100);
            }
        }
        return tempSquareArray;
    }

    static int[][] Summ2SquareArray (int[][] squareArray1, int[][] squareArray2){
        int[][] tempSquareArray = new int[squareArray1.length][squareArray1[0].length];

        for(int i = 0; i < tempSquareArray.length; i++){
            for(int j = 0; j < tempSquareArray[i].length; j++){
                tempSquareArray[i][j] = squareArray1[i][j] + squareArray2[i][j];
            }
        }
        return tempSquareArray;

    }
}