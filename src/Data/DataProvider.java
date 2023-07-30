package Data;

import java.util.LinkedList;
import java.util.Queue;

public class DataProvider {
    public static Queue<String> getAllDataProducts(){
        Queue<String> dataProducts = new LinkedList<>();
        dataProducts.add("apricot");
        dataProducts.add("mango");
        dataProducts.add("cherry");
        dataProducts.add("rice");
        return dataProducts;
    }
}
