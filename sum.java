import java.util.*;
class sum
{
    public static int sum(int a ,int b)
    {
        return a+b;
    }
    public static void main (String []args)
    {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int ans=sum(a,b);
        System.out.println(ans);
    }
}
