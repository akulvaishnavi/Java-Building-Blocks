import java.io.*;
public class SecondAuto
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int m,b,p;
double r=0;
System.out.println("Enter a number");
int n=Integer.parseInt(br.readLine());
m=n;
p=m*m;
int c=0;
do
{
c++;
m=m/10;
}while(m!=0);
int q= p%(int)Math.pow(10,c);

if(n==q)
System.out.println(n+" is an Automorphic number");
else
System.out.println(n+" is not an Automorphic number");
}}
