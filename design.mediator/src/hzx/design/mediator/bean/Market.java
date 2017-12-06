package hzx.design.mediator.bean;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.mediator.bean
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/15 10:52
 */
public class Market implements Department {
    private Mediator mediator;

    public Market(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("Market",this);
    }

    @Override
    public void selfAction() {
        System.out.println("产品销售！");
    }

    @Override
    public void outAction() {
        System.out.println("拉顾客，请吃饭，需要资金支持！");
        mediator.command("Financial");
    }
}
