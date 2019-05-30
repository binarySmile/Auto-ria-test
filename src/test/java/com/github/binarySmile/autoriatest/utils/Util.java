package com.github.binarySmile.autoriatest.utils;

import java.util.ArrayList;
import java.util.List;

public class Util {

    public int getIntegerList(List <String> listSt) {
        ArrayList <Integer> list = new ArrayList <Integer>();
        for (String value : listSt)
            list.add(Integer.parseInt(value));
        for (int i = 0; i < list.size(); i++)
            return list.get(i);
        return 0;
    }

    public int getIntegerValue(String valueSt) {
        int valueIn = Integer.parseInt(valueSt);
        return valueIn;
    }

    public int getQuantity(List <Object> listOb) {
        return listOb.size();
    }
}