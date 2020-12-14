package com.et.chess.client;

import com.et.chess.config.FeignClientConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// feign客户端要访问的是  zuul服务 BASE-MICROSERVICE-ZUUL-GATEWAY
@FeignClient(name = "BASE-MICROSERVICE-ZUUL-GATEWAY",
        configuration = FeignClientConfig.class
)  // 配置要按自定义的类FeignClientConfig
public interface AIClient {



    //访问的路径value要修改成zuul指定的服务路由路径
    @RequestMapping(method = RequestMethod.POST, value = "/et-api/chess/{protocol}",
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    Object get(@RequestParam("protocol") String protocol);
//
//    @RequestMapping(method = RequestMethod.DELETE, value = "/yc-api/piclib-proxy/piclib/{id}")
//    String delete(@RequestParam("id") Integer id);

}