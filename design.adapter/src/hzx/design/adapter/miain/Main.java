/**
 * 工程名称：DesignPattern
 * 工程路径：hzx.design.adapter.miain
 * 团队名称：
 */
package hzx.design.adapter.miain;

import hzx.design.adapter.adapter.Adapter;
import hzx.design.adapter.adapter.Adapter2;
import hzx.design.adapter.interfc.PS2InfcKeyboard;

/**
 * @author ZongxingH
 * @date 2015-12-01 14:34
 * @desc
 * @see
 */
public class Main {

    public static void main(String[] args){
        PS2InfcKeyboard ps2InfcKeyboard = new PS2InfcKeyboard();

        Adapter adapter = new Adapter(ps2InfcKeyboard);
        adapter.handReq();

        Adapter2 adapter2 = new Adapter2();
        adapter2.handReq();
    }
}
