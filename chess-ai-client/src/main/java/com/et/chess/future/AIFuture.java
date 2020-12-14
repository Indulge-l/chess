package com.et.chess.future;

import com.et.chess.service.AIRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

//对外公开的业务层
@Component
public class AIFuture {

    @Autowired
    private AIRestService aiRestService;//业务层

    @Async
    public CompletableFuture<Object> get(String protocol){
        return  CompletableFuture.supplyAsync(()->{
           return aiRestService.get(protocol);
        });
    }

}
