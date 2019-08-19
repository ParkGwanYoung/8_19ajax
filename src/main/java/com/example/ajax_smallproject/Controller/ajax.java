package com.example.spring_test.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
public class ajax {
    @RequestMapping(value = "/remote/openweather")
    public Object actionMethod() {
        RestTemplate restTemplate = new RestTemplate();
        Object tempObject = new Object();
        String keyId = "b6907d289e10d714a6e88b30761fae22";
        String targetUri = "https://openweathermap.org/data/2.5/forecast?id=1835841&appid=b6907d289e10d714a6e88b30761fae22";
        Object resultObject = restTemplate.getForObject(targetUri, Object.class);
        return resultObject;
    }
}