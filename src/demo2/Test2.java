package demo2;

/**
 * 文 件 名: Test2
 * 创 建 人: CXP
 * 创建日期: 2019-04-08 11:50
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Test2 {
    public static void main(String[] args) {
        try {
            // 1. 获取Student类的Class对象
            Class studentClass = Student2.class;

            // 2.1 通过Class对象获取Constructor类对象，从而调用无参构造方法
            // 注：构造函数的调用实际上是在newInstance()，而不是在getConstructor()中调用
            Object mObj1 = studentClass.getConstructor().newInstance();

            // 2.2 通过Class对象获取Constructor类对象（传入参数类型），从而调用有参构造方法
            Object mObj2 = studentClass.getConstructor(String.class).newInstance("CXP");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
