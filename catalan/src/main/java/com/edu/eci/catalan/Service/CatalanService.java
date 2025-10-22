package com.edu.eci.catalan.Service;

import java.util.ArrayList;
import java.util.List;

public class CatalanService {

    private List<Integer> catNumbers = new ArrayList<>();


    public List<Integer> getCatalanList(Integer value) {
        catNumbers.add(0, 1);
        for (int i = 1; i <= value; i++){
            catNumbers.add(-1);
        }
        catalanRecurrence(value);
        for (int j = 0; j < value; j++){
            System.out.println(catNumbers.get(j));
        }
        return catNumbers.subList(0,value + 1);
    }

    public int catalanRecurrence(int value){
        if (value == 0) {
            return 1;
        } else if (catNumbers.get(value) != -1) {
            return catNumbers.get(value);
        }else{
            int response = 0;
            for (int i = 0; i < value; i++){
                response += catalanRecurrence(i) * catalanRecurrence(value - i - 1);
            }
            catNumbers.add(value, response);
            return response;
        }
    }
}
