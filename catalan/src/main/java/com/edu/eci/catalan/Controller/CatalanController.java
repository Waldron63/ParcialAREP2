package com.edu.eci.catalan.Controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.edu.eci.catalan.Service.CatalanService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalanController {

    private static CatalanService catalanService;

    public CatalanController(){
        catalanService = new CatalanService();
    }

    @GetMapping("/catalan")
    public List<Integer> greeting(@RequestParam(value = "value") Integer value) {
        return catalanService.getCatalanList(value);
    }
}