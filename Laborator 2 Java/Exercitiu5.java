import java.util.Scanner;

public class Exercitiu5 {
    public static int calc(int x,int p)
    {
        int pow=1;
        for(int i =1 ; i <= p;i++)
            pow=pow*x;
        return pow;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul");
        int x = scanner.nextInt();
        System.out.println("Introduceti puterea");
        int p = scanner.nextInt();
        System.out.println("Numarul " + x + " la puterea " + p + " este " +calc(x,p));

    }
}
