package Controller;

import Data.DataProvider;
import Model.ModelLogicData;
import View.ViewOptions;

public class ControllerOptions {

    public static void filteringOptions(int numberChoose){
        switch (numberChoose){
            case 1 ->
                ViewOptions.printDataProductsUpdate(ModelLogicData.addData(DataProvider.getAllDataProducts()));
            case 2 ->
                ViewOptions.printDataProductsUpdate(ModelLogicData.deleteData(DataProvider.getAllDataProducts()));
        }
    }
}
