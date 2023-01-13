import java.util.*;
public class InfixToPostfix {
    int top;
    int n;
    char b[];
    StringBuffer p = new StringBuffer();
    InfixToPostfix(int cap)
    {
        top = -1;
        n = cap;
        b = new char[n];
    }
    static int Prec(char ch)
    {
        switch (ch) {
        case '+':
        case '-':
            return 1;
 
        case '*':
        case '/':
            return 2;
 
        case '^':
            return 3;
        }
        return -1;
    }
    void enterStr()
    {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        char a[] = in.toCharArray();
        fix(a);
        sc.close();
    }

    void push(char ch)
    {
            if(top == (n-1))
            {
                System.out.println("Overflow Condition");
            }
            else
            {
                top++;
                b[top] = ch;
            }
    }
    char pop()
    {
        char y = ' ';
        if(top < 0)
        {
        }
        else
        {
            y = b[top];
            top--;
        }
        return y;
    }
    void fix(char[] a)
    {
        for(int i = 0; i < n; i++)
        {
            char x = a[i];
            if(Prec(x) > 0)
            {
                while(top != -1 && Prec(b[top]) >= Prec(x))
                {
                    p.append(pop());
                } 
                push(x);
            }
            else if(x == ')')
            {
                while(top != -1)
                {
                    p.append(pop());
                }
            }
            else if(x == '(')
            {
                push(x);
            }
            else
            {
                p.append(x);
            }
        }
        while(top != -1)
        {
            if(b[top] != '(')
            p.append(pop());
            else
            p.append(' ');
        }
    }
    void display()
    {
        System.out.print(p);
    }
    public static void main(String[] args){
        InfixToPostfix obj = new InfixToPostfix(11);
        obj.enterStr();
        obj.display();
    }
}