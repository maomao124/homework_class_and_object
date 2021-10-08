package step4;

/**
 * Project name(项目名称)：作业 类与对象
 * Package(包名): step4
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/8
 * Time(创建时间)： 17:16
 * Version(版本): 1.0
 * Description(描述)： 无
 */

import java.util.Scanner;

public class Test
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String theMa = sc.next();
        int quantity = sc.nextInt();
        boolean likeSoup = sc.nextBoolean();
        /********** Begin **********/
        //使用三个参数的构造方法创建WuMingFen对象  取名 f1
        WuMingFen fi = new WuMingFen(theMa, quantity, likeSoup);
        //使用两个参数的构造方法创建WuMingFen对象  取名 f2
        WuMingFen f2 = new WuMingFen(theMa, quantity);
        //使用无参构造方法创建WuMingFen对象  取名 f3
        WuMingFen f3 = new WuMingFen();
        //分别调用三个类的 check方法
        fi.check();
        f2.check();
        f3.check();

        /********** End **********/
    }
}
