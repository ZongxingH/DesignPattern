/**
 * 工程名称：DesignPattern
 * 工程路径：hzx.design.dynamicproxy.proxy
 * 团队名称：
 */
package hzx.design.dynamicproxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author ZongxingH
 * @date 2015-12-02 19:44
 * @desc
 * @see
 */
public class StarHandler implements InvocationHandler {

    private SuperStar superStar;

    public StarHandler(SuperStar superStar){
        this.superStar = superStar;

    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        method.invoke(superStar,args);
        return null;
    }
}
