package com.edu.eci.catalan.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CatalanService {

    private List<Integer> catNumbers = new ArrayList<>();
    public List<Integer> getCatalanList(Integer value) {
        if (value<1){
            return null;
        }
        catNumbers.add(1);
        if (value==1){
            return catNumbers;
        }else {
            catalanRecurrence(value, 0);
        }
    }

    public int catalanRecurrence(Integer value, Integer count){
        if (Objects.equals(count, value)) {
            return 1;
        }else {
            Integer ci = (catNumbers.get(count)*) + ;
            catNumbers.add(ci);
            return ci;
        }
    }
}
