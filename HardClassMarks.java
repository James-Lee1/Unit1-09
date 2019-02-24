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
        // Cycles through every student in the class

        for (int students = 0; students < classMarks.length; students ++)
        {
            System.out.printf("Student %s marks  :  ", Integer.toString(students + 1));
            // Cycles through each of their assignments
            for (int assignments = 0; assignments < classMarks[students].length; assignments ++)
            {
                // Generates a mark from 80-100
                classMarks[students][assignments] = rand.nextInt(100 - 80) + 80;
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

        average = averageCalc(classMarks);
        System.out.printf("The class average is %.1f%n",average);
    }

    public static double averageCalc(double[][] classMarks)
    {
        double average;
        double total;
        double arrLength;
        total = 0.0;
        arrLength = 0;

        for(int i=0; i < classMarks.length; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                // Adds up the total of all the class marks
                total = total + classMarks[i][j];
                // FInds total length of array
                arrLength += 1;
            }
        }

        // Finds the average
        average = total / arrLength;
        return average;
    }

}
