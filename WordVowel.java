import java.util.Scanner;
public class WordVowel
{
    public static void main(String args[])
    {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter Word");
        String s = sc.nextLine();
        s = s + " ";
        String word = "";
        for(int i = 0; i < s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch != ' ')
            {
                word = word + ch;
            }
            else 
            {
               char ch1 = word.charAt(0);
                if(ch1 == 'a' ||ch1 ==  'e' || ch1 == 'i' || ch1 == 'o' || 
                ch1 == 'u' || ch1 == 'A' ||ch1 ==  'E' || ch1 == 'I' ||ch1 == 
                'O' ||ch1 ==  'U')
                {
                    System.out.println(word + " ");
    }
    word = "";
}
}
}
}
