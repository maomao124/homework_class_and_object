package test1;

/**
 * Project name(项目名称)：作业 类与对象
 * Package(包名): test1
 * Class(类名): TestMain
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/8
 * Time(创建时间)： 17:37
 * Version(版本): 1.0
 * Description(描述)： 无
 */

class MyClass2
{
    static int i = 10;

    static
    {
        i = 20;
        System.out.println("In Static");
    }

    public MyClass2()
    {
        System.out.println("MyClass()");
    }

    public MyClass2(int i)
    {
        System.out.println("MyClass(int)");
        this.i = i;
    }
}

public class TestMain
{
    public static void main(String args[])
    {
        MyClass2 mc1 = new MyClass2();
        System.out.println(mc1.i);
        MyClass2 mc2 = new MyClass2(10);
        System.out.println(mc2.i);
    }
}
