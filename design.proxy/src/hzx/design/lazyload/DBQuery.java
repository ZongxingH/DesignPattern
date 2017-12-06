package hzx.design.lazyload;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.lazyload
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Email： zongxingh@163.com
 * Tel: 157*****778
 * Create Time:  2017/7/1 19:54
 */
public class DBQuery implements IDBQuery {
    public DBQuery() {
        try {
            Thread.sleep(1000 * 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String request() {

        return "query SQL";
    }
}
