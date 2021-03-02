import java.util.Scanner;
/**
 * Scrieti un program care afiseaza toate nr cuprinse intre 0 si n care sunt div cu 5 dar nu si cu 10
 */
public class Exercitiu1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul n");
        int n = scanner.nextInt();
        for( int i =0; i <n; i++)
        {
            if( (i % 5 == 0) && (i%2 != 0))
            {
                System.out.println(i + " ");
            }
        }



    }

}
