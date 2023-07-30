package View;

import Controller.ControllerOptions;
import Data.DataProvider;

import java.util.Queue;
import java.util.Scanner;

public class ViewOptions {
    public static int numberChoose;
    public static void runApp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                How do you want to update the data? (Choose a number)
                1. Add data.
                2. Delete data.
                0. Exit the application.
                """);

          numberChoose = scanner.nextInt();
        ControllerOptions.filteringOptions(numberChoose);

    }
    public static void printDataProducts(Queue<String> dataProducts) {
        int count = 1;
        System.out.println("Initial data:");
        for (String data : dataProducts) {
            System.out.println(count + ") " + data);
            count++;
        }
    }
    public static void printDataProductsUpdate(Queue<String> dataProducts){
        printDataProducts(DataProvider.getAllDataProducts());
        int count = 1;
        System.out.println("Updated data:");
        for (String data: dataProducts){
            System.out.println(count + ") " + data);
        }

    }


}