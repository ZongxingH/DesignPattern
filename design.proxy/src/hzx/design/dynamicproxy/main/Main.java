/**
 * 工程名称：DesignPattern
 * 工程路径：hzx.design.dynamicproxy.main
 * 团队名称：
 */
package hzx.design.dynamicproxy.main;

import hzx.design.dynamicproxy.proxy.StarHandler;
import hzx.design.dynamicproxy.proxy.SuperStar;
import hzx.design.staticproxy.proxy.Star;

import java.lang.reflect.Proxy;

/**
 * @author ZongxingH
 * @date 2015-12-02 19:44
 * @desc
 * @see
 */
public class Main {

    public static void main(String[] args){

        SuperStar superStar = new SuperStar();
        StarHandler handler = new StarHandler(superStar);

        Star star = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                    new Class[]{Star.class}, handler);

        star.confer();
        star.signContract();
        star.bookTicket();
        star.sing();
        star.getMoney();

    }

}
