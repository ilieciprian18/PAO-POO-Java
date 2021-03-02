import java.util.Scanner;

public class Exercitiu2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti a: ");
        int a = scanner.nextInt();
        System.out.println("Introduceti b: ");
        int b = scanner.nextInt();
        System.out.println("Introduceti c: ");
        int c = scanner.nextInt();
        if( (a >= b) && (a >= c)) {
            System.out.print(a);
            if( a ==b || a==c )
                System.out.print(" = ");
            else System.out.println(" > ");
            if (b > c)
                System.out.print(b +" > " + c);
            else if (c>b)
                System.out.print(c +" > " + b);
            else System.out.println(c + " = " + b);
        }
        else

        if( (b >= a) && (b >= c)) {
            System.out.print(b);
            if( b == a || b ==c )
                System.out.print(" = ");
            else System.out.println(" > ");
            if (a > c)
                System.out.print(a +" > " + c);
            else if(c>a)
                System.out.print(c +" > " + a);
            else System.out.println(a + " = " + c);
        }
        else

        if( (c >= b) && (c >= a)) {
            System.out.print(c + " > ");
            if (b > a)
                System.out.print(b +" > " + a);
            else if (a > b)
                System.out.print(a +" > " + b);
            else System.out.println(a + " = " + b);
        }


        //System.out.println(comp(a, b));

    }

    public static int comp(int a, int b) {
        if (a > b)
            return a;
        else return b;
    }

}

