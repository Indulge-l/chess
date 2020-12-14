package com.et.chess.test;

//远端接口定义
//import com.yc.ifav.domain.TagDomain;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface RemoteApi
{
//    //访问的路径value要修改成zuul指定的服务路由路径
//    String findAll();
//
//    @RequestMapping(method = RequestMethod.POST, value = "/yc-api/tag-proxy/tag/add",
//            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
//            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//    String create(@RequestBody TagDomain tagDomain);
//
//    @RequestMapping(method = RequestMethod.POST, value = "/yc-api/tag-proxy/tag/update",
//            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
//            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//    String update(@RequestBody TagDomain tagDomain);
//
//    @RequestMapping(method = RequestMethod.DELETE, value = "/yc-api/tag-proxy/tag/{id}")
//    String delete(@RequestParam("id") Integer id);
}