package hzx.design.mediator.bean;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.mediator.bean
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/15 10:52
 */
public class Developer implements Department {
    private Mediator mediator;

    public Developer(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("Developer",this);
    }

    @Override
    public void selfAction() {
        System.out.println("项目研发！");
    }

    @Override
    public void outAction() {
        System.out.println("接项目，需要资金支持！");
        mediator.command("Financial");
    }
}
