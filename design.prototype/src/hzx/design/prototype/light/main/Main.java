/**
 * 工程名称：DesignPattern
 * 工程路径：clone
 * 团队名称：
 */
package hzx.design.prototype.light.main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ZongxingH
 * @date 2015-11-27 11:31
 * @desc
 * @see
 */
public class Main {

    public static void main(String[] args) throws ParseException {
//        People p1 = new People();
//        Date date = new Date(123456778L);
//        p1.setBirth(date);
//        p1.setName("hello world");
//        p1.setAge(23);
//
//        System.out.println(p1.getName()+ "\n" + p1.getBirth() + "\n" + p1.getAge());
//
//        People p2 = (People) p1.peopleClone();
//
//        date.setTime(242363567678L);
//        System.out.println(p1.getName()+ "\n" + p1.getBirth() + "\n" + p1.getAge());
//        System.out.println(p2.getName()+ "\n" + p2.getBirth() + "\n" + p2.getAge());

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = df.format(new Date());
        System.out.println(dateStr);
        Date date = df.parse(dateStr);
        System.out.println(date.toString());

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(dateStr, pos);
        System.out.println(strtodate);

    }

}
