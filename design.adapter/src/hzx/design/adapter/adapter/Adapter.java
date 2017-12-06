/**
 * 工程名称：DesignPattern
 * 工程路径：hzx.design.adapter.adapter
 * 团队名称：
 */
package hzx.design.adapter.adapter;

import hzx.design.adapter.interfc.PS2InfcKeyboard;

/**
 * PS/2转USB接口(适配器)
 * 对象适配器方式
 * @author ZongxingH
 * @date 2015-12-01 14:29
 * @desc
 * @see
 */
public class Adapter implements Adaptee {

    private PS2InfcKeyboard ps2InfcKeyboard;

    public Adapter(PS2InfcKeyboard ps2InfcKeyboard){
        this.ps2InfcKeyboard = ps2InfcKeyboard;
    }

    @Override
    public void handReq() {
        ps2InfcKeyboard.request();
    }
}
