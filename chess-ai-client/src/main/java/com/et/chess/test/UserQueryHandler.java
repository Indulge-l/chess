package com.et.chess.test;

//使用方式
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/yc-api")
public class UserQueryHandler {

    @Autowired
    DynamicFeignClient<RemoteApi> client;

    @RequestMapping("/tag-proxy/tag/findAll")
    public String query()
    {
//        //伪代码，自己的数据索引服务
//        //定位数据的服务群组
//        String service_location = GetUidLocation(uid);
        String service_location = "BASE-IFAV-ZUUL-GATEWAY";
        RemoteApi api = client.GetFeignClient(RemoteApi.class, service_location);
        return null;
        //return api.findAll();
    }
}