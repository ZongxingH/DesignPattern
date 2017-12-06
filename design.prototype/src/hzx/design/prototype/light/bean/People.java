/**
 * 工程名称：DesignPattern
 * 工程路径：clone
 * 团队名称：
 */
package hzx.design.prototype.light.bean;

import java.util.Date;

/**
 * @author ZongxingH
 * @date 2015-11-27 11:15
 * @desc
 * @see
 */
public class People implements Cloneable{
    Date birth;
    String name;
    int age;

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Object peopleClone() throws CloneNotSupportedException {

        return  super.clone();

    }
}
