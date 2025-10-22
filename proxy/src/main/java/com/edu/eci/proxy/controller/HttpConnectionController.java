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
        try{
            System.out.println("conexion a catalan 1");
            String resp = HttpConnectionService.getConnection("http://98.93.53.43:8080/catalan?value="+value);
            return resp;
        }catch (IOException e){
            try {
                System.out.println("conexion a catalan 2");
                return HttpConnectionService.getConnection("http://3.90.113.72:8080/catalan?value="+value);
            }catch (IOException e1){
                return e1.getMessage();
            }
        }
    }
}
