package com.linjh.dome240723;

import java.util.ArrayList;
import java.util.List;

public class test1 {
    public List<List<Integer>> generate(int numRows) {


        List<List<Integer>> resultList = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        resultList.add(integers);
        if (numRows == 1) {
            return resultList;
        }
        ArrayList<Integer> objects = new ArrayList<>();
        objects.add(1);
        objects.add(1);
        resultList.add(objects);
        if (numRows == 2) {
            return resultList;
        }
        for (int i = 3; i <= numRows; i++) {
            List<Integer> integers1 = resultList.get(i - 2);
            ArrayList<Integer> integers2 = new ArrayList<>();
            integers2.add(1);
            for (int j = 1; j < i - 1; j++) {
                integers2.add(integers1.get(j) + integers1.get(j - 1));
            }
            integers2.add(1);
            resultList.add(integers2);
        }
        return resultList;
    }

}
