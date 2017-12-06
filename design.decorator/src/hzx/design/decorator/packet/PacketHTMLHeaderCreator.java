package hzx.design.decorator.packet;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.decorator.packet
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Email： zongxingh@163.com
 * Tel: 157*****778
 * Create Time:  2017/7/2 18:16
 */
public class PacketHTMLHeaderCreator extends PacketDecorator {
    public PacketHTMLHeaderCreator(IPacketCreator iPacketCreator) {
        super(iPacketCreator);
    }

    @Override
    public String handleContent() {
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("<html>");
        strBuilder.append("<head>");
        strBuilder.append("</head>");
        strBuilder.append("<body>");
        strBuilder.append(iPacketCreator.handleContent());
        strBuilder.append("</body>");
        strBuilder.append("</html>");
        return strBuilder.toString();
    }
}
