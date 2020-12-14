package com.et.chess.config;

//使用方式
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/query")
public class UserQueryHandler {

    @Autowired
    DynamicFeignClient<RemoteApi> client;

    @RequestMapping("/userinfo")
    public String query(@RequestParam(value = "uid") String uid)
    {
//        //伪代码，自己的数据索引服务
//        //定位数据的服务群组
//        String service_location = GetUidLocation(uid);
        String service_location = "";
        RemoteApi api = client.GetFeignClient(RemoteApi.class, service_location);
        return api.info(uid);
    }
}