public class NestedFor5
{
    public static void main (String args [])
    {
        int n = 1;
        for(int i = 9; i >=n; i = i - 2)
        {
            for (int j = 9; j >=i; j = j - 2)
            {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
}
