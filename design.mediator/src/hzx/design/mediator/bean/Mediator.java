package hzx.design.mediator.bean;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.mediator.bean
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/15 10:49
 */
public interface Mediator {
    void command(String name);
    void register(String name,Department dept);
}
