package hzx.design.composite.main;

import hzx.design.composite.bean.AbstractFile;
import hzx.design.composite.bean.FolderFile;
import hzx.design.composite.bean.ImageFile;
import hzx.design.composite.bean.TextFile;
import hzx.design.composite.bean.VideoFile;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.composite.main
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/8 16:36
 */
public class Main {

    public static void main(String[] args){
        AbstractFile f1 = new ImageFile("王杰的大头照.jpg");
        AbstractFile f2 = new TextFile("王杰的情书.txt");
        AbstractFile f3 = new VideoFile("李健大战王杰与郭闪闪.avi");
        FolderFile f4 = new FolderFile("我的收藏");
        FolderFile f5 = new FolderFile("视频");
        f5.add(f3);
        f4.add(f5);
        f4.add(f1);
        f4.add(f2);
        f4.killVirus();
    }
}
