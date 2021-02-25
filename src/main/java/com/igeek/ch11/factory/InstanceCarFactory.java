package com.igeek.ch11.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.0
 * @Description 实例工厂
 * @Author chenmin
 * @Date 2021/2/25 9:43
 */
public class InstanceCarFactory {

    private Map<String,Car> map;

    public InstanceCarFactory(){
        map = new HashMap<>();
        map.put("111",new Car("mini","祖母绿"));
        map.put("222",new Car("smart","蓝色"));
    }

    public Car getCar(String key){
        return map.get(key);
    }
}
