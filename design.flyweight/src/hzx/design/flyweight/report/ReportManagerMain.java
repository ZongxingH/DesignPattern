package hzx.design.flyweight.report;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.flyweight.report
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Email： zongxingh@163.com
 * Tel: 157*****778
 * Create Time:  2017/7/2 16:46
 */
public class ReportManagerMain {
    public static void main(String[] args) {
        ReportManagerFactory factory = new ReportManagerFactory();
        IReportManager reportManager_1 = factory.getEmployeeReportManager("aaaa");
        System.out.println(reportManager_1.createReport());

        IReportManager reportManager_2 = factory.getFinancialReportManager("bbbb");
        System.out.println(reportManager_2.createReport());
    }
}
