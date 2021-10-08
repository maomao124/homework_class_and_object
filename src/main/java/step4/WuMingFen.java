package step4;

/**
 * Project name(项目名称)：作业 类与对象
 * Package(包名): step4
 * Class(类名): WuMingFen
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/8
 * Time(创建时间)： 17:17
 * Version(版本): 1.0
 * Description(描述)： 无
 */

/********** Begin **********/
//在这里添加包名  step4

//创建类 添加属性和方法


/********** End **********/
public class WuMingFen
{
    private String theMa;  //面码
    private int quantity;  //分量
    private boolean likeSoup; //是否带汤

    public WuMingFen(String theMa, int quantity, boolean likeSoup)
    {
        this.theMa = theMa;
        this.quantity = quantity;
        this.likeSoup = likeSoup;
    }

    public WuMingFen(String theMa, int quantity)
    {
        this.theMa = theMa;
        this.quantity = quantity;
        this.likeSoup = false;
    }

    public WuMingFen()
    {
        this.theMa = "酸辣";
        this.quantity = 2;
        this.likeSoup = true;
    }

    public void check()
    {
        StringBuilder s = new StringBuilder();
        s.append("面码：").append(theMa).append("，粉的份量：").append(quantity).append("两，是否带汤：").append(likeSoup);
        System.out.println(s);
    }

}
