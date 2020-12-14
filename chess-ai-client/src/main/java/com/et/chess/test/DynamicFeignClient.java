package com.et.chess.test;


//动态Feign客户端
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClientBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DynamicFeignClient<T>
{
    private FeignClientBuilder feignClientBuilder;

    public DynamicFeignClient(@Autowired ApplicationContext appContext) {

        this.feignClientBuilder = new FeignClientBuilder(appContext);
    }

    public T GetFeignClient(final Class<T> type, String serviceId)
    {
        return this.feignClientBuilder.forType(type, serviceId).build();
    }

}