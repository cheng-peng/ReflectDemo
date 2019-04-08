package demo3;

/**
 * 文 件 名: demo3.Student3
 * 创 建 人: CXP
 * 创建日期: 2019-04-08 10:12
 * 描    述: 学生实体类
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class Student3 {

    public Student3() {
        System.out.println("创建了一个Student实例");
    }

    // 无参数方法
    public void setName1 (){
        System.out.println("调用了无参方法：setName1（）");
    }

    // 有参数方法
    public void setName2 (String str){
        System.out.println("调用了有参方法setName2（String str）:" + str);
    }
}
