package com.edu.eci.catalan.Service;

import java.util.ArrayList;
import java.util.List;

public class CatalanService {
    public List<Integer> getCatalanList(Integer value) {
        if (value<1){
            return null;
        }
        List<Integer> catNumbers = new ArrayList<>();
        int newValue;
        if (value==1){
            catNumbers.add(value);
            return catNumbers;
        }else {
            newValue = value;
        }
        while (newValue != 1){
            
        }
    }
}
