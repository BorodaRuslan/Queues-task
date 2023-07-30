package Model;


import java.util.Queue;
import java.util.Scanner;

public class ModelLogicData {
    public static Scanner scanner = new Scanner(System.in);

    public static Queue<String> deleteData(Queue<String> dataProducts) {
        System.out.println("Enter the name of the product to be deleted?");
        String nameProduct = scanner.next().trim();
        if (dataProducts.contains(nameProduct)) {
            dataProducts.remove(nameProduct);
        } else {
            System.out.println("There is no such product!");
        }
        return dataProducts;
    }

    public static Queue<String> addData(Queue<String> dataProducts) {
        System.out.println("Enter the name of the product you want to add");
        String nameProduct = scanner.nextLine().trim();
        dataProducts.add(nameProduct);
        return dataProducts;
    }

}
