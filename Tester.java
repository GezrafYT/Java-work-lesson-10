public class Tester {
    public static void ex1(int num)
    {
        if(num >= 1) {
            System.out.println(num);
            ex1(num - 1);
        }
    }

    public static void ex2(int num)
    {
        if (num >= 1)
        {
            ex2(num - 1);
            System.out.println(num);
        }
    }

    public static int ex3(int x, int n)
    {
        if(n == 0)
        {
            return 1;
        }
        else
        {
            return x * ex3(x, n-1);
        }

    }

    public static void main(String[] args)
    {
//        ex1(5);
//        ex2(4);
//        System.out.println((ex3(5, 3)));
    }
}
