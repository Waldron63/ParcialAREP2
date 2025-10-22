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

    @GetMapping("/catalan")
    public String greeting(@RequestParam(value = "value") Integer value) throws IOException {
        String resp = HttpConnectionService.getConnection("http://3.90.113.72:8080/catalan?value="+value);
        if (resp == null){
            return HttpConnectionService.getConnection("http://3.90.113.72:8080/catalan?value="+value);
        }else{
            return resp;
        }
    }
}
