package demo4;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * 文 件 名: TestFile
 * 创 建 人: CXP
 * 创建日期: 2019-04-08 12:12
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class TestFile {
    public static void main(String[] args) {
        try {
            // 1. 读取属性配置文件
            Properties pro = new Properties();
            pro.load(new FileInputStream(new File("Product.properties")));
//            pro.load(this.getAssets().open("Product.properties"));

            // 2. 获取属性配置文件中的产品类名
            String Classname = pro.getProperty("ProductB");

            // 3. 动态生成产品类实例
            Product concreteProduct = Factory.getInstance(Classname);

            // 4. 调用该产品类对象的方法，从而生产产品
            concreteProduct.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
