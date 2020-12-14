package com.et.chess.service;

import com.et.chess.client.AIClient;
import com.google.gson.Gson;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

//Hystrix服务层:  调用 PiclibClient,实现断路器功能
@Service
public class AIRestService {
    @Autowired
    private AIClient aiClient;


    @HystrixCommand(fallbackMethod = "findByIdFallback")
    public Object get(String protocal) {
        return aiClient.get(protocal);
    }

    private String findByIdFallback(Integer id) {
        Map map = new HashMap();
        map.put("code", "-1");
        map.put("msg", "服务异常");
        return new Gson().toJson(map);
    }


}