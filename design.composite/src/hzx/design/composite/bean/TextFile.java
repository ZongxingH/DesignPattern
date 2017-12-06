package hzx.design.composite.bean;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.composite.bean
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/8 16:29
 */
public class TextFile extends AbstractFile {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }
    @Override
    public void killVirus() {
        System.out.println("对文本文件 " + name + "进行查杀！");
    }
}
