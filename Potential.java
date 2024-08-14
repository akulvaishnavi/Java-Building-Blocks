import java.util.Scanner;
public class Potential
{
public static void main(String args[])
{
Scanner sc = new  Scanner(System.in);
System.out.println("Enter Word");
String s = sc.nextLine();
s = s + " ";
String word = "";
int c = 0,pot = 0;
for(int i = 0; i < s.length();i++)
{
char ch1 = s.charAt(i);
if(ch1 == ' ')
{
c++;
}
}
String l[] = new String[c];
int bfg[] = new int[c];
for(int i = 0; i < s.length();i++)
{
char ch = s.charAt(i);
if(ch != ' ')
{
word = word + ch;
pot = pot + (int)(ch - 64);
}
else
{
for(int j = 0; j < c;j++)
{
word = l[j];
pot = bfg[j];
}
word = "";
}
}
for(int i = 0; i < c; i++)//for loop used for getting i a value
{
for(int j = 0; j < (c - 1); j++)//for loop to use array indexes 
                                    //for sorting
{
if(l[j + 1].compareTo(l[j]) < 0)//if a[j+1] index is smaller than a[j] index
{
String t = l[j];
l[j] = l[j + 1];//swapping of elements
l[j + 1] = t;
int t1 = bfg[j];
bfg[j] = bfg[j + 1];//swapping of elements
bfg[j + 1] = t1;
}
}
}
for(int i = 0; i < 5; i++)
{
System.out.println(l[i] + "  " + bfg[i]);
}
}
}
