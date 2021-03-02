import java.util.Scanner;

public class Exercitiu4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int nr=0,sum =0;
        while ( x != -1)
        {
            nr++;
            sum = sum + x;
            x = scanner.nextInt();
        }

        System.out.println("Media aritmetica a numerelor este : " + (sum/nr));
    }
}
