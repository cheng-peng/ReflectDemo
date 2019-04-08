package demo1;

import java.lang.reflect.Field;

/**
 * 文 件 名: Test1
 * 创 建 人: CXP
 * 创建日期: 2019-04-08 11:47
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Test1 {
    public static void main(String[] args) {
        try {
            // 1. 获取Student类的Class对象
            Class studentClass = Student1.class;

            // 2. 通过Class对象创建Student类的对象
            Object mStudent = studentClass.newInstance();

            // 3. 通过Class对象获取Student类的name属性
            Field f = studentClass.getDeclaredField("name");

            // 4. 设置私有访问权限
            f.setAccessible(true);

            // 5. 对新创建的Student对象设置name值
            f.set(mStudent, "CXP");

            // 6. 获取新创建Student对象的的name属性 & 输出
            System.out.println(f.get(mStudent));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
