package com.igeek.ch11.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.0
 * @Description 静态工厂
 * @Author chenmin
 * @Date 2021/2/25 9:34
 */
public class StaticCarFactory {

    private static Map<String,Car> map = new HashMap<>();

    static {
        map.put("AAA",new Car("大奔","白色"));
        map.put("BBB",new Car("宝马","银色"));
    }

    public static Car getCar(String key){
        return map.get(key);
    }

}
