package hzx.design.flyweight.weiqi.main;

import hzx.design.flyweight.weiqi.bean.FlyWeightFactory;
import hzx.design.flyweight.weiqi.bean.Locations;
import hzx.design.flyweight.weiqi.bean.WeiQi;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.flyweight.design.main
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/13 16:19
 */
public class Main {

    public static void main(String[] args){
        WeiQi weiQi1 = FlyWeightFactory.getBean("白色棋子");
        WeiQi weiQi2 = FlyWeightFactory.getBean("白色棋子");
        WeiQi weiQi3 = FlyWeightFactory.getBean("黑色棋子");
        weiQi1.display(new Locations(10,10));
        weiQi2.display(new Locations(15,15));
        weiQi3.display(new Locations(20,20));
    }
}
