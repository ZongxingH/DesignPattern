package hzx.design.decorator.packet;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.decorator.packet
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Email： zongxingh@163.com
 * Tel: 157*****778
 * Create Time:  2017/7/2 18:13
 */
public abstract class PacketDecorator implements IPacketCreator {

    IPacketCreator iPacketCreator;
    public PacketDecorator(IPacketCreator iPacketCreator){
        this.iPacketCreator = iPacketCreator;
    }
}
