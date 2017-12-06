package hzx.design.chainofresp.bean;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.chainofresp.bean
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/14 20:14
 */
public class Director extends Leader {

    public Director(String name) {
        super(name);
    }

    @Override
    public void delLeaveReqs(LeaveRequest request) {
        if (request.getLeaveDay() < 3){
            System.out.println(request);
            System.out.println("部门负责人 " + this.name + " 审批通过！");
        }else {
            if (this.nextLeader != null){
                this.nextLeader.delLeaveReqs(request);
            }
        }
    }
}
