package hzx.design.chainofresp.bean;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.chainofresp.bean
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/14 20:14
 */
public class GeneralManger extends Leader {

    public GeneralManger(String name) {
        super(name);
    }

    @Override
    public void delLeaveReqs(LeaveRequest request) {
        if (request.getLeaveDay() < 15){
            System.out.println(request);
            System.out.println("总经理 " + this.name + " 审批通过！");
        }else {
            System.out.println("总经理 " + this.name + " 审批不通过通过，需要面聊！");
        }
    }
}
