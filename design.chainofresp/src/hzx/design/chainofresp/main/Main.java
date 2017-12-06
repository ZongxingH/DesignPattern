package hzx.design.chainofresp.main;

import hzx.design.chainofresp.bean.Director;
import hzx.design.chainofresp.bean.GeneralManger;
import hzx.design.chainofresp.bean.Leader;
import hzx.design.chainofresp.bean.LeaveRequest;
import hzx.design.chainofresp.bean.Manger;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  hzx.design.chainofresp.main
 * Project Name:  DesignPattern
 * Author:  ZongxingH
 * Create Time:  2016/12/14 20:23
 */
public class Main {
    public static void main(String[] args){
        Leader leader1 = new Director("张三");
        Leader leader2 = new Manger("李四");
        Leader leader3 = new GeneralManger("王五");

        leader1.setNextLeader(leader2);
        leader2.setNextLeader(leader3);

        LeaveRequest leaveRequest = new LeaveRequest("麻子",1,"学习驾照");
        LeaveRequest leaveRequest1 = new LeaveRequest("王麻子",13,"出国探亲");

        leader1.delLeaveReqs(leaveRequest);
        System.out.println("--------------------------------------------");
        leader1.delLeaveReqs(leaveRequest1);
    }
}
