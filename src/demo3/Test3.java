package demo3;

import java.lang.reflect.Method;

/**
 * 文 件 名: demo3.Test3
 * 创 建 人: CXP
 * 创建日期: 2019-04-08 10:12
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Test3 {

    public static void main(String[] args) {

        try {
            // 1. 获取Student类的Class对象
            Class studentClass = Student3.class;

            // 2. 通过Class对象创建Student类的对象
            Object  mStudent = studentClass.newInstance();

            // 3.1 通过Class对象获取方法setName1（）的Method对象:需传入方法名
            // 因为该方法 = 无参，所以不需要传入参数
            Method msetName1 = studentClass.getMethod("setName1");

            // 通过Method对象调用setName1（）：需传入创建的实例
            msetName1.invoke(mStudent);

            // 3.2 通过Class对象获取方法setName2（）的Method对象:需传入方法名 & 参数类型
            Method msetName2 = studentClass.getMethod("setName2",String.class);

            // 通过Method对象调用setName2（）：需传入创建的实例 & 参数值
            msetName2.invoke(mStudent,"CXP");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
