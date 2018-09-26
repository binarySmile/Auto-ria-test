package com.github.binarySmile.autoriatest.utils;

import java.util.ArrayList;
import java.util.List;

public class Util {

    public int getIntegerList(List <String> listSt) {
        ArrayList <Integer> list = new ArrayList <Integer>();
        for (String value : listSt)
            list.add(Integer.parseInt(String.valueOf(value)));
        for (int i = 0; i < list.size(); i++)
            return list.get(i);
        return 0;
    }

    public int getIntegerValue(String valueSt) {
        int valueIn = Integer.parseInt(valueSt);
        return valueIn;
    }

    public int getCastom(List <Object> listOb) {
        Integer listIn = Integer.valueOf(String.valueOf(listOb.size()));
        return listIn;
    }

    public int getCountCars(int count, List <String> marka) {
        if (count == 0)
            System.out.println("no cars " + marka + "by selected parameters");
        if (count > 0)
            System.out.println("on the selected parameters: " + count + " cars " + marka);
        return count;
    }
}