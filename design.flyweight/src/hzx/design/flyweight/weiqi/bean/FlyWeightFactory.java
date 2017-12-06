package hzx.design.flyweight.weiqi.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.flyweight.design.bean
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/13 15:54
 */
public class FlyWeightFactory {
    private static Map<String,WeiQi> map = new HashMap<String,WeiQi>();

    public static WeiQi getBean(String color){
        if (map.get(color) != null){
            return map.get(color);
        }else {
            WeiQi weiQi = new WeiQi(color);
            map.put(color,weiQi);
            return weiQi;
        }
    }
}
