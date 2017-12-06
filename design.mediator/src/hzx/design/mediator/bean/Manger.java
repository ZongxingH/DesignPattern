package hzx.design.mediator.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.mediator.bean
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/15 10:59
 */
public class Manger implements Mediator {
    private static Map<String,Department> map = new HashMap<>();

    @Override
    public void command(String name) {
        map.get(name).selfAction();
    }

    @Override
    public void register(String name, Department dept) {

        map.put(name,dept);
    }
}
