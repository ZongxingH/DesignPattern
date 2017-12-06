/**
 * 工程名称：DesignPattern
 * 工程路径：factory.abstractfactory.bean
 * 团队名称：
 */
package hzx.design.factory.abstractfactory.bean;

/**
 * @author ZongxingH
 * @date 2015-11-24 17:31
 * @desc
 * @see
 */
public class LuxuryTire implements Tire {
    @Override
    public String use() {
        return "【耐磨损】";
    }
}
