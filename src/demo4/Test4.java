package demo4;

/**
 * 文 件 名: Test4
 * 创 建 人: CXP
 * 创建日期: 2019-04-08 11:57
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Test4 {
    public static void main(String[] args) {
        // 1. 通过调用工厂类的静态方法（反射原理），从而动态创建产品类实例
        // 需传入完整的类名 & 包名
        Product concreteProduct = Factory.getInstance("demo4.ProductA");

        // 2. 调用该产品类对象的方法，从而生产产品
        concreteProduct.show();
    }
}
