package com.kevinmichie;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution {

    public void fractionOfPositives(int[] arrayOfValues){
        double positiveValueCounter = 0;
        for(int i = 0; i < arrayOfValues.length; i++){
            if(arrayOfValues[i] > 0){
                positiveValueCounter++;
            }
        }
        double positiveFractionValues = positiveValueCounter/arrayOfValues.length;
        DecimalFormat df = new DecimalFormat("#0.000000");
        System.out.println(df.format(positiveFractionValues));
    }

    public void fractionOfNegatives(int[] arrayOfValues){
        double negativeValueCounter = 0;
        for(int i = 0; i < arrayOfValues.length; i++){
            if(arrayOfValues[i] < 0){
                negativeValueCounter++;
            }
        }
        double positiveFractionValues = negativeValueCounter/arrayOfValues.length;
        DecimalFormat df = new DecimalFormat("#0.000000");
        System.out.println(df.format(positiveFractionValues));
    }

    public void fractionOfZeroes(int[] arrayOfValues){
        double zeroValueCounter = 0;
        for(int i = 0; i < arrayOfValues.length; i++){
            if(arrayOfValues[i] == 0){
                zeroValueCounter++;
            }
        }
        double positiveFractionValues = zeroValueCounter/arrayOfValues.length;
        DecimalFormat df = new DecimalFormat("#0.000000");
        System.out.println(df.format(positiveFractionValues));
    }

    public static void main(String[] args) {
	    Solution solution = new Solution();

        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int[] arrayOfValues = new int[sizeOfArray];
        for(int i = 0; i < sizeOfArray; i++){
            arrayOfValues[i] = scanner.nextInt();
        }

        solution.fractionOfPositives(arrayOfValues);
        solution.fractionOfNegatives(arrayOfValues);
        solution.fractionOfZeroes(arrayOfValues);
    }
}


// Helpful decimal formatting website
// http://stackoverflow.com/questions/13433142/java-repeating-decimal-in-simple-equation