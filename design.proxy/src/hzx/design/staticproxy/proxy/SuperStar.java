/**
 * 工程名称：DesignPattern
 * 工程路径：hzx.design.staticproxy.proxy
 * 团队名称：
 */
package hzx.design.staticproxy.proxy;

/**
 * @author ZongxingH
 * @date 2015-12-01 15:47
 * @desc
 * @see
 */
public class SuperStar implements Star {
    @Override
    public void confer() {
        System.out.println("SuperStar:confer()");
    }

    @Override
    public void signContract() {
        System.out.println("SuperStar:signContract()");
    }

    @Override
    public void bookTicket() {
        System.out.println("SuperStar:bookTicket()");
    }

    @Override
    public void sing() {
        System.out.println("SuperStar:sing()");
    }

    @Override
    public void getMoney() {
        System.out.println("SuperStar:getMoney()");
    }
}
