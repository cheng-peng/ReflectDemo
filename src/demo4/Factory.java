package demo4;

/**
 * 文 件 名: Factory
 * 创 建 人: CXP
 * 创建日期: 2019-04-08 11:56
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Factory {
    // 定义方法：通过反射动态创建产品类实例
    public static Product getInstance(String ClassName) {

        Product concreteProduct = null;

        try {

            // 1. 根据 传入的产品类名 获取 产品类类型的Class对象
            Class product_Class = Class.forName(ClassName);
            // 2. 通过Class对象动态创建该产品类的实例
            concreteProduct = (Product) product_Class.newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }

        // 3. 返回该产品类实例
        return concreteProduct;
    }
}
