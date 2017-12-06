package hzx.design.mediator.main;

import hzx.design.mediator.bean.Department;
import hzx.design.mediator.bean.Developer;
import hzx.design.mediator.bean.Financial;
import hzx.design.mediator.bean.Manger;
import hzx.design.mediator.bean.Market;
import hzx.design.mediator.bean.Mediator;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.mediator.main
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/15 11:05
 */
public class Main {
    public static void main(String[] args){
        Mediator mediator = new Manger();
        Department dev1 = new Developer(mediator);
        Department dev2 = new Market(mediator);
        Department dev3 = new Financial(mediator);

        dev1.outAction();
    }
}
