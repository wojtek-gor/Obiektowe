import java.util.Random;
import java.util.Scanner;

public class CwiczenieMacierz {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int m = 0;
        int n = 0;
        int k = 0;
        while(true)
        {
            System.out.println("Podaj pierwsza liczbe: ");
            m=scanner.nextInt();
            if(m<=10 && m>=1)
                break;
            System.out.println("Blad");
        }
        while(true)
        {
            System.out.println("Podaj druga liczbe: ");
            n=scanner.nextInt();
            if(n<=10 && n>=1)
                break;
            System.out.println("Blad");
        }
        while(true)
        {
            System.out.println("Podaj trzecia liczbe: ");
            k=scanner.nextInt();
            if(k<=10 && k>=1)
                break;
            System.out.println("Blad");
        }
        int[][] taba = new int[m][n];
        int[][] tabb = new int[n][k];
        int[][] tabc = new int[m][k];
        generuj(taba,m,n);
        generuj(tabb,n,k);
        wypisz(taba,m,n);
        wypisz(tabb,n,k);

    }
    public static void generuj (int[][] tab, int a, int b)
    {
        Random r = new Random();
        for (int j = 0; j < a; ++j)
        {
            for(int i=0; i<b; i++)
            {
                tab[j][i] = r.nextInt(10);
            }

        }
    }
    public static void wypisz(int[][] tab, int a, int b)
    {
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.print(tab[i][j]);
                System.out.print(' ');
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
//    public static void iloczynMacierzy(int[][] tab, int[][] tab2, int[][] tab3, int a, int b, int c )
//    {
//        for(int i=0;i<a;i++)
//        {
//            for(int j=0;j<b;j++)
//            {
//                for(int k=0,l=0;k<b,l<a)
//            }
//        }
//    }
}
