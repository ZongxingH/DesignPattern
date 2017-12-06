/**
 * 工程名称：DesignPattern
 * 工程路径：hzx.design.staticproxy.proxy
 * 团队名称：
 */
package hzx.design.staticproxy.proxy;

/**
 * @author ZongxingH
 * @date 2015-12-01 15:49
 * @desc
 * @see
 */
public class ProxyStar implements Star {

    private SuperStar superStar;

    public ProxyStar(SuperStar superStar){
        this.superStar = superStar;
    }

    @Override
    public void confer() {
        System.out.println("ProxyStar:confer()");
    }

    @Override
    public void signContract() {
        System.out.println("ProxyStar:signContract()");
    }

    @Override
    public void bookTicket() {
        System.out.println("ProxyStar:bookTicket()");
    }

    @Override
    public void sing() {
        this.superStar.sing();
    }

    @Override
    public void getMoney() {
        System.out.println("ProxyStar:getMoney()");
    }
}
