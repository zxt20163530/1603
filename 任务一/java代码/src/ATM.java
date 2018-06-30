import java.util.*;
class Atmd
{
    String name;
    String date;
    int yuan;
    String mima;
    public int denglu()
    {
        int a=0;
        System.out.print("请输入密码：");
        String s;
        Scanner in=new Scanner(System.in);
        s=in.nextLine();
        if(mima.equals(s))
        {
            a=1;
            return a;
        }
        else
        {
            System.out.println("密码错误，卡已经锁死！！！");
            return a;
        }
    }
    public void cunkuan()
    {
        System.out.println("请输入存款金额：");
        Scanner in=new Scanner(System.in);
        int a;
        a=in.nextInt();
        yuan=yuan+a;
    }
    public void zhuanzhang()
    {
        String yonghuming;
        System.out.println("请输入卡号：");
        Scanner in=new Scanner(System.in);
        yonghuming=in.nextLine();
        System.out.println("请输入转账金额：");
        int a;
        a=in.nextInt();
        yuan=yuan-a;
        System.out.println("转账成功！！！");
    }
    public void qukuan()
    {
        int i;
        System.out.println("请选择金额：1:  100   2: 500    3: 1000   4: 1500    5: 2000    6: 选择其他金额            7:  退卡");
        Scanner in=new Scanner(System.in);
        i=in.nextInt();
        if(i==1)
        {
            if(yuan<100)
            {
                System.out.println("账户余额不足！！！");
            }
            else
            {
            yuan=yuan-100;
            }
        }
        else if(i==2)
        {
            if(yuan<500)
            {
                System.out.println("账户余额不足！！！");
            }
            else
            {
            yuan=yuan-500;
            }
        }
        else if(i==3)
        {
            if(yuan<1000)
            {
                System.out.println("账户余额不足！！！");
            }
            else
            {
            yuan=yuan-1000;
            }
        }
        else if(i==4)
        {
            if(yuan<1500)
            {
                System.out.println("账户余额不足！！！");
            }
            else
            {
            yuan=yuan-1500;
            }
        }
        else if(i==5)
        {
            if(yuan<2000)
            {
                System.out.println("账户余额不足！！！");
            }
            else
            {
            yuan=yuan-2000;
            }
        }
        else if(i==6)
        {
        System.out.print("请输入需要的金额：");
        int s;
        s=in.nextInt();
        if(yuan<s)
        {
            System.out.println("账户余额不足！！！");
        }
        else
        {
        yuan=yuan-s;
        }
        }
    }
    public Atmd(String a,String b,int c)
    {
        name=a;
        date=b;
        yuan=c;
        mima="20163531";
    }
    public void xiugai()
    {
        String a;
        System.out.print("请输入新密码：");
        Scanner in=new Scanner(System.in);
        a=in.nextLine();
        mima=a;
    }
    public void chaxun()
    {
        System.out.println("当前账户余额为"+yuan);
    }
}
public class ATM {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Atmd a=new Atmd("zhangzixiang","20163531",100000);
        int w,q,e;
        e=a.denglu();
        if(e==1)
        {
        for(q=0;;q++)
        {
            System.out.println("请选择操作项目：");
            System.out.println("1 取款");
            System.out.println("2 转账：");
            System.out.println("3 存款：");
            System.out.println("4 查询余额：");
            System.out.println("5 修改密码：");
            System.out.println("6 退卡");
            Scanner in=new Scanner(System.in);
            q=in.nextInt();
            if(q==1)
            {
               a.qukuan();
            }
            else if(q==2)
            {
               a.zhuanzhang();
            }
            else if(q==3)
            {
               a.cunkuan();
            }
            else if(q==4)
            {
               a.chaxun();
            }
            else if(q==5)
            {
               a.xiugai();
            }
            else
            {
               break;
            }
            
        }
        }

    }

}
