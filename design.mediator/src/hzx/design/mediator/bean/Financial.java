package hzx.design.mediator.bean;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.mediator.bean
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/15 10:52
 */
public class Financial implements Department {
    private Mediator mediator;

    public Financial(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("Financial",this);
    }

    @Override
    public void selfAction() {
        System.out.println("维护公司资金账目！");
    }

    @Override
    public void outAction() {
        System.out.println("从公司账户拨款！");
    }
}
