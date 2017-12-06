package hzx.design.templatemethod.main;

import hzx.design.templatemethod.bean.BankTemplateMethod;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.templatemethod.main
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/18 15:46
 */
public class Main {
    public static void main(String[] args){
        BankTemplateMethod btm0 = new BankTemplateMethod() {
            @Override
            public void doTranscat() {
                System.out.println("我要存款！");
            }
        };
        btm0.doProcess();

        BankTemplateMethod btm1 = new BankTemplateMethod() {
            @Override
            public void doTranscat() {
                System.out.println("我要取款！");
            }
        };
        btm1.doProcess();

        BankTemplateMethod btm2 = new BankTemplateMethod() {
            @Override
            public void doTranscat() {
                System.out.println("我要理财！");
            }
        };
        btm2.doProcess();
    }
}
