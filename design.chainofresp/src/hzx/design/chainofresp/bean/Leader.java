package hzx.design.chainofresp.bean;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.chainofresp.bean
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/14 20:10
 */
public abstract class Leader {
    protected String name;
    protected Leader nextLeader;

    public Leader(String name) {
        this.name = name;
    }

    public void setNextLeader(Leader leader){
        this.nextLeader = leader;
    }

    public abstract void delLeaveReqs(LeaveRequest request);
}
