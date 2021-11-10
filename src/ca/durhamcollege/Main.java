/**
 * @author Ivan Mokrooussov
 * @studentID: 100808605
 * @date: November 8, 2021
 */
package ca.durhamcollege;

import java.util.Scanner;

public class Main
{


    /**
     * The method gets a string from console
     * @param prompt a friendly message to show the user
     * @param object the object type gets as input
     * @return the value from the console
     */
    public static Object getConsoleInput(String prompt, Object object)
    {
        Scanner console = new Scanner(System.in);
        System.out.print(prompt);


        switch (object.getClass().getSimpleName())
        {
            case "STRING":
                return console.nextLine();
            case "INT":
                return console.nextInt();
            case "FLOAT":
                return console.nextFloat();
            default:
                return console.nextLine();
        }

    }

    public  static void printLog(int[] log)
    {
        for (var line:log)
        {
            System.out.println(line);
        }
    }

    public  static void printLog(float[] log)
    {
        for (var line:log)
        {
            System.out.println(line);
        }
    }

    public  static void printLog(String[] log)
    {
        for (var line:log)
        {
            System.out.println(line);
        }
    }

    public  static void buildLog(int[] log)
    {
        for (int i = 0; i < Config.NUM_OF_INTEGERS; i++)
        {
            //String className = log[i].getClass().getSimpleName();
            String prompt = "Enter your integer: ";
            log[i] = (int) getConsoleInput(prompt, log[i]);
        }
    }

    public  static void buildLog(float[] log)
    {
        for (int i = 0; i < Config.NUM_OF_FLOATS; i++)
        {
            //String className = log[i].getClass().getSimpleName();
            String prompt = "Enter your float: ";
            log[i] = (float) getConsoleInput(prompt, log[i]);
        }
    }

    public  static void buildLog(String[] log)
    {
        for (int i = 0; i < Config.NUM_OF_STRINGS; i++)
        {
            //String className = log[i].getClass().getSimpleName();
            String prompt = "Enter your String: ";
            log[i] = (String) getConsoleInput(prompt, log[i]);
        }
    }


    /**
     * Entry point for our application
     * @param args
     */
    public static void main(String[] args)
    {
        String[] stringLog = new String[Config.NUM_OF_STRINGS];
        int[] intLog = new int[Config.NUM_OF_INTEGERS];
        float[] floatLog = new float[Config.NUM_OF_FLOATS];

        buildLog(intLog);
        printLog(intLog);
        System.out.println();

        buildLog(floatLog);
        printLog(floatLog);
        System.out.println();

        buildLog(stringLog);
        printLog(stringLog);
        System.out.println();


/*
        // Step 1. Creating an empty space/container for the collection
	    String[] log = new String[Config.NUM_OF_STRINGS];
        for (int i = 0; i < Config.NUM_OF_STRINGS; i++)
        {
            log[i] = getConsoleInput("Enter your info: ");

        }
        printLog(log);


        int intNumber = 0;
        float floatNumber = 0.0f;
        String stringInput = "";

        stringInput = (String) getConsoleInput("Enter the string", stringInput);
        System.out.println("Our String is: " + stringInput);

        intNumber = (int) getConsoleInput("Enter an Integer: ", intNumber);
        System.out.println("Our Integer is: " + intNumber);

        floatNumber = (float) getConsoleInput("Enter an Integer: ", floatNumber);
        System.out.println("Our Integer is: " + floatNumber);
*/


    }
}
