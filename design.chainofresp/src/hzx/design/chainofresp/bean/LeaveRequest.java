package hzx.design.chainofresp.bean;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.chainofresp.bean
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/14 20:04
 */
public class LeaveRequest {
    private String name;
    private int leaveDay;
    private String reason;

    public LeaveRequest(String name, int leaveDay, String reason) {
        this.name = name;
        this.leaveDay = leaveDay;
        this.reason = reason;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLeaveDay() {
        return leaveDay;
    }

    public void setLeaveDay(int leaveDay) {
        this.leaveDay = leaveDay;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "员工 " + name + " 请" + leaveDay + "天假，请假理由是："
                + reason;
    }
}
