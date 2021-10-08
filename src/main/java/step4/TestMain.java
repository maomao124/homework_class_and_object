package step4;

/**
 * Project name(项目名称)：作业 类与对象
 * Package(包名): step4
 * Class(类名): TestMain
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/8
 * Time(创建时间)： 17:33
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class TestMain
{
    public static void main(String args[])
    {
        MyClass3 mc1 = new MyClass3();
        MyClass3 mc2 = new MyClass3();
        mc1.a = 100;
        mc1.b = 200;
        mc2.a = 300;
        mc2.b = 400;
        System.out.println(mc1.a);
        System.out.println(mc1.b);
        System.out.println(mc2.a);
        System.out.println(mc2.b);
    }
}

class MyClass3
{
    static int a;
    int b;
}
