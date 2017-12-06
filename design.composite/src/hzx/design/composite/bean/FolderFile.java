package hzx.design.composite.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.composite.bean
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/8 16:32
 */
public class FolderFile extends AbstractFile {
    private String name;
    private List<AbstractFile> list;

    public FolderFile(String name) {
        this.name = name;
        list = new ArrayList<AbstractFile>();
    }

    public void add(AbstractFile file){
        list.add(file);
    }

    public void remove(AbstractFile file){
        list.remove(file);
    }
    public AbstractFile get(int index){
        return list.get(index);
    }
    @Override
    public void killVirus() {
        System.out.println("对文件夹文件 " + name + "进行查杀！");
        for (AbstractFile file : list){
            file.killVirus();
        }
    }
}
