package com.tiMorpheus.Singleton;


import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@Singleton
public class CacheSingletonBean {

    private Map<Integer, String> myCache;

    @PostConstruct
    public void start(){
        Logger.getLogger("MyGlobalLogger").info("Started");
        myCache = new HashMap<>();
    }

    public void addUser(Integer id, String name){
        myCache.put(id, name);
    }
    public String getName(Integer id){
        return  myCache.get(id);
    }

}