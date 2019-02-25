/****************************************************************************
 *
 * Created by: James Lee
 * Created on: Feb 2019
 * Created for: ICS4U
 * This program randomly generates the marks for 4 students, and their 6
 * assignments
 *
 ****************************************************************************/

import java.util.Random;
import java.util.Arrays;

public class HardClassMarks {

    public static void main(String[] arg)
    {
        Random rand = new Random();
        double average;
        double[][] classMarks = new double[4][6];
        int numTimes = 0;
        int [] arr = new int[5050];

        // Makes it more likely to get a higher number
        for (int i = 1; i <= 100; i++)
        {
            for (int c = 0; c < i; c++)
            {
                arr[numTimes] = i;
                numTimes += 1;
            }
        }

        // Cycles through every student in the class
        for (int students = 0; students < classMarks.length; students ++)
        {
            System.out.printf("Student %s marks  :  ", Integer.toString(students + 1));
            // Cycles through each of their assignments
            for (int assignments = 0; assignments < classMarks[students].length; assignments ++)
            {
                // Generates a number from 1-100
                classMarks[students][assignments] = arr[rand.nextInt(5050)];
                if (assignments < classMarks[students].length - 1)
                {
                    System.out.print(classMarks[students][assignments] + ", ");
                }
                else
                {
                    System.out.printf("%s%n", classMarks[students][assignments]);
                }
            }
        }

        average = averageMark(classMarks);
        System.out.printf("The class average is %.1f%n",average);
    }

    public static double averageMark(double[][] classMarks)
    {
        double average;
        double totalSum;
        double totalNumOfElem;
        totalSum = 0.0;
        totalNumOfElem = 0;

        for(int i=0; i < classMarks.length; i++)
        {
            for (int j = 0; j < classMarks[0].length; j++)
            {
                // Adds up the total of all the class marks
                totalSum = totalSum + classMarks[i][j];
                // FInds total length of array
                totalNumOfElem += 1;
            }
        }

        // Finds the average
        average = totalSum / totalNumOfElem;
        return average;
    }

}
