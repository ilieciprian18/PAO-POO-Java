/**
 * Scrieti un program care verifica daca un numar este prim si o alta metoda care afiseaza toat nr prime < 50
 */
public class Exercitiu3 {
    public static int verif(int x)
    {
        for(int d=2;d<=x/2;d++)
            if( x % d ==0)
                return 0;
        return 1;
    }
    public static void afis()
    {
        for(int i=2;i<=50;i++)
            if(verif(i) == 1)
                System.out.println(i);
    }

    public static void main(String[] args) {
        afis();
    }
}
