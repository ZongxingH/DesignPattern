/**
 * 工程名称：DesignPattern
 * 工程路径：hzx.design.adapter.adapter
 * 团队名称：
 */
package hzx.design.adapter.adapter;

import hzx.design.adapter.interfc.PS2InfcKeyboard;

/**
 * 类适配器
 * @author ZongxingH
 * @date 2015-12-01 14:37
 * @desc
 * @see
 */
public class Adapter2 extends PS2InfcKeyboard implements Adaptee {
    @Override
    public void handReq() {
        request();
    }
}
