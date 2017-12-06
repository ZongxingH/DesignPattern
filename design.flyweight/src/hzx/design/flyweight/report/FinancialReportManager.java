package hzx.design.flyweight.report;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.flyweight.report
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Email： zongxingh@163.com
 * Tel: 157*****778
 * Create Time:  2017/7/2 16:31
 */
public class FinancialReportManager implements IReportManager {

    private String tenantId;

    public FinancialReportManager(String tenantId){
        this.tenantId = tenantId;
    }

    @Override
    public String createReport() {
        return this.tenantId + " create financial report";
    }
}
