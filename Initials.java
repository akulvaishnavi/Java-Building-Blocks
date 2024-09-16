import java.util.Scanner;
public class Initials
{
    public static void main(String args[])
    {
         Scanner sc = new  Scanner(System.in);
        System.out.println("Enter Word");
        String s = sc.nextLine();
        s = s + " ";
        String word = "";
        String l = "";
        int max = 0;
        for(int i = 0; i < s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch != ' ')
            {
                word = word + ch;
            }
            else 
            {
                l = word.toUpperCase();
                char ch1 = l.charAt(0);
                System.out.print(ch1 + ".");
                word = "";
            }
        }
    }
}
