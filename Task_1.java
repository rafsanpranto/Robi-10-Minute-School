package com.mycompany.robi10minuteschool;

import java.util.Scanner;

public class Task_1 {
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        //Get the dimensions and array elements from the user
        System.out.println("Enter the number of rows: ");
        int rows = in.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = in.nextInt();
        int arr[][] = new int[rows][cols];
        
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                arr[i][j] = in.nextInt();
            }
        }
        
        //Display the array in Matrix form
        System.out.println();
        System.out.println("INPUT MATRIX");
        
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        //Compute rowMax
        int rowMax = 0;
        for (int i = 0; i < rows; i++) 
        {
            int rSum = 0;
            for (int j = 0; j < cols; j++) 
            {
                rSum += arr[i][j];
            }
            if(rSum>rowMax)
            {
                rowMax = rSum;
            }
        }
        System.out.println("Maximum sum of the following rows is " + rowMax);
        
        //Compute colMax
        int colMax = 0;
        for (int i = 0; i < cols; i++) 
        {
            int cSum = 0;
            for (int j = 0; j < rows; j++) 
            {
                cSum += arr[j][i];
            }
            if(cSum>colMax)
            {
                colMax = cSum;
            }
        }
        System.out.println("Maximum sum of the following columns is " + colMax);
        
        //compute minimum between rowMax and colMax.
        if(rowMax<colMax)
        {
            System.out.println("Between rowMax and colMax, rowMax is minimum.");
        }
        else if(colMax<rowMax)
        {
            System.out.println("Between rowMax and colMax, colMax is minimum.");
        }
    }
}
