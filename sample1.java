import java.util.*;
class sample1
{
public static void main(String args[])
{
int n,count=0,r,i=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter n value");
n=sc.nextInt();
while(n>0)
{
r=n%10;
if(r%2==0)
count++;
else
i++;
n=n/10;
}
System.out.println("even numbers are"+count);
System.out.println("odd numbers are"+i);
}
}
