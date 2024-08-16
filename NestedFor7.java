public class NestedFor7
{
    public static void main (String args[])
    {
        int n = 9;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 9; j>=i; j--)
            {
                System.out.print(j + " ");
            }
            System.out.println();
    }
}
}
