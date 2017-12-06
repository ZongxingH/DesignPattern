/**
 * 工程名称：DesignPattern
 * 工程路径：hzx.design.builder.bean
 * 团队名称：
 */
package hzx.design.builder.bean;

/**
 * @author ZongxingH
 * @date 2015-11-25 16:06
 * @desc
 * @see
 */
public class Seat {
    private String name;

    public Seat(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
