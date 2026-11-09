import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        byte a = 5;
        byte b = 6;

        System.out.println(a + " " + b);

        Scanner scan = new Scanner(System.in);

        short c = scan.nextShort();
        short d = scan.nextShort();

        System.out.println(c + " " + d);

        int e = 12;
        int f = 78;

        System.out.println(e + " " + f);

        long g = 123456789L;
        long h = 987654321L;

        System.out.println(g + " " + h);

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        byte x = 0101;
        int y = 1010;

        System.out.println(x + " " + y);

        float j = 1.09f;
        float k = 10.87F;

        System.out.println(j + " " + k);

        double l = 6.7d;
        double m = 1.2d;

        System.out.println(l + " " + m);

        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        char n = 'A';
        char o = 'B';

        System.out.println(n);
        System.out.println(o);


        char s = 77;
        char w = 109;

        System.out.println(s);
        System.out.println(w);

        System.out.println('K');

        System.out.println(75);

        System.out.println('\u004B');

        System.out.println(0x4B);

        System.out.println(0113);

        System.out.println(0b1001011);

        boolean p = true;
        boolean q = false;

        System.out.println(p);
        System.out.println(q);

        //int year = 201l;
        //System.out.print(year);
        //kompilacia sxal e chenq karox int-i mej texadrel long;
    }
}
