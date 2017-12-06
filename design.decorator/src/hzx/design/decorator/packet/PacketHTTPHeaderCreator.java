package hzx.design.decorator.packet;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.decorator.packet
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Email： zongxingh@163.com
 * Tel: 157*****778
 * Create Time:  2017/7/2 18:21
 */
public class PacketHTTPHeaderCreator extends PacketDecorator {
    public PacketHTTPHeaderCreator(IPacketCreator iPacketCreator) {
        super(iPacketCreator);
    }

    @Override
    public String handleContent() {
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("Cache-Control:no-cache\n");
        strBuilder.append("Date:Mon,31 Dec 2017 18:23:57 GMT\n");
        strBuilder.append(iPacketCreator.handleContent());
        return strBuilder.toString();
    }
}
