/**
 * 工程名称：DesignPattern
 * 工程路径：factory.abstractfactory.bean
 * 团队名称：
 */
package hzx.design.factory.abstractfactory.bean;

/**
 * @author ZongxingH
 * @date 2015-11-24 17:22
 * @desc
 * @see
 */
public class LuxuryEngine implements Engine {

    @Override
    public String run() {
        return "【跑的快】";
    }

    @Override
    public String start(){
        return "【启动快】";
    }

    @Override
    public String stop() {
        return "【熄火快】";
    }

}
