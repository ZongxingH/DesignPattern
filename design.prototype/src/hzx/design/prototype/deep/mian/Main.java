package hzx.design.prototype.deep.mian;

import hzx.design.prototype.deep.bean.People;

import java.util.Date;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  design.prototype.deep.mian
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/6 16:25
 */
public class Main {

    public static void main(String[] args){
        People p1 = new People();
        Date date = new Date(123456778L);
        p1.setBirthday(date);
        p1.setName("hello world");
        p1.setAge(23);

        System.out.println(p1);

        People p2 = People.clone(p1);

        date.setTime(242363567678L);
        System.out.println(p1);
        System.out.println(p2);

    }
}
