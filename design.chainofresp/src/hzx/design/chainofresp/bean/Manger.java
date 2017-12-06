package hzx.design.chainofresp.bean;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.chainofresp.bean
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/14 20:14
 */
public class Manger extends Leader {

    public Manger(String name) {
        super(name);
    }

    @Override
    public void delLeaveReqs(LeaveRequest request) {
        if (request.getLeaveDay() < 10){
            System.out.println(request);
            System.out.println("部门经理 " + this.name + " 审批通过！");
        }else {
            if (this.nextLeader != null){
                this.nextLeader.delLeaveReqs(request);
            }
        }
    }
}
