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
        System.out.print("���������룺");
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
            System.out.println("������󣬿��Ѿ�����������");
            return a;
        }
    }
    public void cunkuan()
    {
        System.out.println("���������");
        Scanner in=new Scanner(System.in);
        int a;
        a=in.nextInt();
        yuan=yuan+a;
    }
    public void zhuanzhang()
    {
        String yonghuming;
        System.out.println("�����뿨�ţ�");
        Scanner in=new Scanner(System.in);
        yonghuming=in.nextLine();
        System.out.println("������ת�˽�");
        int a;
        a=in.nextInt();
        yuan=yuan-a;
        System.out.println("ת�˳ɹ�������");
    }
    public void qukuan()
    {
        int i;
        System.out.println("��ѡ���1:  100   2: 500    3: 1000   4: 1500    5: 2000    6: ѡ���������            7:  �˿�");
        Scanner in=new Scanner(System.in);
        i=in.nextInt();
        if(i==1)
        {
            if(yuan<100)
            {
                System.out.println("�˻����㣡����");
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
                System.out.println("�˻����㣡����");
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
                System.out.println("�˻����㣡����");
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
                System.out.println("�˻����㣡����");
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
                System.out.println("�˻����㣡����");
            }
            else
            {
            yuan=yuan-2000;
            }
        }
        else if(i==6)
        {
        System.out.print("��������Ҫ�Ľ�");
        int s;
        s=in.nextInt();
        if(yuan<s)
        {
            System.out.println("�˻����㣡����");
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
        System.out.print("�����������룺");
        Scanner in=new Scanner(System.in);
        a=in.nextLine();
        mima=a;
    }
    public void chaxun()
    {
        System.out.println("��ǰ�˻����Ϊ"+yuan);
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
            System.out.println("��ѡ�������Ŀ��");
            System.out.println("1 ȡ��");
            System.out.println("2 ת�ˣ�");
            System.out.println("3 ��");
            System.out.println("4 ��ѯ��");
            System.out.println("5 �޸����룺");
            System.out.println("6 �˿�");
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
