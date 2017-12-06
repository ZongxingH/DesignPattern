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
public class DBQueryProxy implements IDBQuery {
    private DBQuery dbQuery = null;
    @Override
    public String request() {
        if (null == dbQuery){
            dbQuery = new DBQuery();
        }
        return dbQuery.request();
    }
}
