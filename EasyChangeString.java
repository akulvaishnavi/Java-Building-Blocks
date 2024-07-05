public class EasyChangeString
{
   public static void main (String args[])
   {
       String s = "January 26 is celebrated as Republic Day in India";
       s = s.replace("January 26", "August 15");
       s = s.replace("Republic", "Independence");
       System.out.println(s);
    }
}
