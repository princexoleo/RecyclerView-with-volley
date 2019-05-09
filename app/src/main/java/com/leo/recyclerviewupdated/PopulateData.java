package com.leo.recyclerviewupdated;

import java.util.ArrayList;
import java.util.List;

public class PopulateData {
    public static List<ModelClass> dataToBePasess(){
        List<ModelClass>recyclerModels =new ArrayList<>();

        for (int i =0 ; i<20 ; i++){
            ModelClass modelClass = new ModelClass();
            modelClass.setTitle("Helllo");
            modelClass.setPrice("$85");
            recyclerModels.add(modelClass);
        }
        return recyclerModels;
    }
}
