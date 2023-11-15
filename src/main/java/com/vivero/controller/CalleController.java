package com.vivero.controller;

import com.vivero.entity.Calle;
import com.vivero.service.CalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.stream.Collectors;

@Controller
@RequestMapping("/calle")
public class CalleController {

    @Autowired
    CalleService calleService;

    @GetMapping("/getAll")
    @ResponseBody
    public String getAll(){
        String s = calleService.getAll().stream()
                .map(Calle::getNombre)
                .collect(Collectors.joining(", "));
        System.out.println(s);
        return s;
    }
}
