package hzx.design.singleton.utils;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  com.sinovate.ngrms.giambsc.support.utils
 * Project Name:  usi.ngrms.grpcdm
 * Author:  ZongxingH
 * Email： zongxingh@163.com
 * Tel: 157*****778
 * Create Time:  2017/5/19 15:18
 */
public class SerializableUtils {

    public static byte[] serialize(Object obj) {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(obj);
            return bos.toByteArray();
        } catch (Exception e) {
            throw new RuntimeException("serialize [" + obj.getClass() + "] error", e);
        }
    }

    public static Object deserialize(byte[] objBytes) {
//        System.out.println("[deserialize]" + sessionStr);
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(objBytes);
            ObjectInputStream ois = new ObjectInputStream(bis);
            return ois.readObject();
        } catch (Exception e) {
            throw new RuntimeException("deserialize [" + objBytes + "] error", e);
        }
    }

}
