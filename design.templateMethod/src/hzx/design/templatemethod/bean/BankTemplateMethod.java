package hzx.design.templatemethod.bean;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.templatemethod.bean
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/18 15:41
 */
public abstract class BankTemplateMethod {
    public void takeTicket(){
        System.out.println("排队取号！");
    }
    public abstract void doTranscat();

    public void evaluate(){
        System.out.println("给评分！");
    }
    public final void doProcess(){
        takeTicket();
        doTranscat();
        evaluate();
    }
}
