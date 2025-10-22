package com.edu.eci.proxy.controller;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.edu.eci.proxy.network.HttpConnectionService;

@RestController
public class HttpConnectionController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "value") Integer value) throws IOException {
        if (){
            return HttpConnectionService.getConnection("");
        }
    }
}
