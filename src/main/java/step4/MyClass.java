package step4;

/**
 * Project name(项目名称)：作业 类与对象
 * Package(包名): step4
 * Class(类名): MyClass
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/8
 * Time(创建时间)： 17:35
 * Version(版本): 1.0
 * Description(描述)： 无
 */

class MyClass {
    int a;
    static int b;
    void fa(){
    }
    static void fb(){
    }
    public void m1(){
        System.out.println(a);    //位置1
        System.out.println(b);    //位置2
        fa();                     //位置3
        fb();                     //位置4
    }
    public static void m2(){
        //System.out.println(a);    //位置5
        System.out.println(b);    //位置6
       // fa();                    //位置7
        fb();                    //位置8
    }
}
