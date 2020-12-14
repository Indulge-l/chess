package com.et.chess.config;

//远端接口定义
import org.springframework.web.bind.annotation.RequestMapping;

public interface RemoteApi
{
    @RequestMapping("/api/info")
    String info(String uid);
}