package hzx.design.bridge.main;

import hzx.design.bridge.bean.Brand;
import hzx.design.bridge.bean.Computer;
import hzx.design.bridge.bean.Desktop;
import hzx.design.bridge.bean.Lenovo;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.bridge.main
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/7 16:44
 */
public class Main {

    public static void main(String[] args){
        Brand brand = new Lenovo();
        Computer computer = new Desktop(brand);
        computer.sale();
    }
}
