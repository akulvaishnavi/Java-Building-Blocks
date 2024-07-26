import java.util.Scanner;
public class Largest
{
    public static void main(String args[])
    {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter Word");
        String s = sc.nextLine();
        s = s + " ";
        String word = "";
        String l = "";
        for(int i = 0; i < s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch != ' ')
            {
                word = word + ch;
            }
            else 
            {
                int max = 0;
                int j = word.length();
                if(j > max)
                {
                    max = j;
                    l = word;
                }
                word = " ";
    }
}
System.out.println("The Largest word is " + l);
}
}
