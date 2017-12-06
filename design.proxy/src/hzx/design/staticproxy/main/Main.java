/**
 * 工程名称：DesignPattern
 * 工程路径：hzx.design.staticproxy.main
 * 团队名称：
 */
package hzx.design.staticproxy.main;

import hzx.design.staticproxy.proxy.ProxyStar;
import hzx.design.staticproxy.proxy.SuperStar;

/**
 * @author ZongxingH
 * @date 2015-12-01 16:37
 * @desc
 * @see
 */
public class Main {

    public static void main(String[] args){
        SuperStar superStar = new SuperStar();
        ProxyStar proxyStar = new ProxyStar(superStar);
        proxyStar.confer();
        proxyStar.signContract();
        proxyStar.bookTicket();
        proxyStar.sing();
        proxyStar.getMoney();
    }

}