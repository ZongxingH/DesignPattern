package hzx.design.flyweight.report;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.flyweight.report
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Email： zongxingh@163.com
 * Tel: 157*****778
 * Create Time:  2017/7/2 16:34
 */
public class ReportManagerFactory {

    private static Map<String,IReportManager> financialReportManagers = new HashMap<String,IReportManager>();
    private static Map<String,IReportManager> employeeReportManagers = new HashMap<String,IReportManager>();

    public IReportManager getFinancialReportManager(String tenantId) {
        IReportManager reportManager = financialReportManagers.get(tenantId);
        if (null == reportManager){
            reportManager = new FinancialReportManager(tenantId);
            financialReportManagers.put(tenantId,reportManager);
        }
        return reportManager;
    }


    public IReportManager getEmployeeReportManager(String tenantId) {
        IReportManager reportManager = employeeReportManagers.get(tenantId);
        if (null == reportManager){
            reportManager = new EmployeeReportManager(tenantId);
            employeeReportManagers.put(tenantId,reportManager);
        }
        return reportManager;
    }


}
