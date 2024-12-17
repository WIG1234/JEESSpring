package org.example.configserver.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ConfigDisplay {
    @Value("${spring.datasource.url}")
    private String database;
    @Value("${test.var}")
    private String num;
    @GetMapping("/conf")
    public Map getConfId(){
        return Map.of("db",this.database,"val",this.num);
    }

}
