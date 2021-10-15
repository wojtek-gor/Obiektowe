import java.util.Scanner;
import java.lang.Math;

public class Pierwszy_pdf { public static void main(String[] agrs)
    {
        // zad 1a
        Scanner scaner = new Scanner(System.in);
        int n = scaner.nextInt();
        int suma=0;
        for(int i=0;i<n;i++)
        {
            int a=scaner.nextInt();
            suma = suma + a;
        }
        System.out.println(suma);
        // zad 1b
//        Scanner scaner = new Scanner(System.in);
//        int n = scaner.nextInt();
//        int il=1;
//        for(int i=0;i<n;i++)
//        {
//            int a=scaner.nextInt();
//            il = il * a;
//        }
//        System.out.println(il);
        // zad 1c
//        Scanner scaner = new Scanner(System.in);
//        int n = scaner.nextInt();
//        int suma=0;
//        for(int i=0;i<n;i++)
//        {
//            int a=scaner.nextInt();
//            if(a<0)
//            {
//                a=a*-1;
//            }
//            suma = suma + a;
//        }
//        System.out.println(suma);
        // zad 1d
//        Scanner scaner = new Scanner(System.in);
//        int n = scaner.nextInt();
//        double suma=0;
//        for(int i=0;i<n;i++)
//        {
//            double a=scaner.nextDouble();
//            if(a<0)
//            {
//                a=a*-1;
//            }
//
//            suma = suma + Math.sqrt(a);
//        }
//        System.out.println(suma);
        // zad 1e
//        Scanner scaner = new Scanner(System.in);
//        int n = scaner.nextInt();
//        double ln=1;
//        for(int i=0;i<n;i++)
//        {
//            double a=scaner.nextDouble();
//            if(a<0)
//            {
//                a=a*-1;
//            }
//
//            ln = ln * a;
//        }
//        System.out.println(ln);
        // zad 1f
//        Scanner scaner = new Scanner(System.in);
//        int n = scaner.nextInt();
//        double suma=0;
//        for(int i=0;i<n;i++)
//        {
//            double a=scaner.nextDouble();
//            suma = suma + Math.pow(a,2);
//        }
//        System.out.println(suma);
        // zad 1g
//        Scanner scaner = new Scanner(System.in);
//        int n = scaner.nextInt();
//        double suma=0;
//        double ln=1;
//        for(int i=0;i<n;i++)
//        {
//            double a=scaner.nextDouble();
//            suma = suma + a;
//            ln = ln * a;
//        }
//        System.out.println(suma);
//        System.out.println(ln);
        // zad 1h
//        Scanner scaner = new Scanner(System.in);
//        int n = scaner.nextInt();
//        double suma=0;
//        for(int i=0;i<n;i++)
//        {
//            double a=scaner.nextDouble();
//            if(i%2==1)
//            {
//                a=a*-1;
//            }
//
//            suma = suma + a;
//        }
//        System.out.println(suma);
        //zad 1i
//        Scanner scaner = new Scanner(System.in);
//        int n = scaner.nextInt();
//        double suma=0;
//        for(int i=1;i<=n;i++)
//        {
//            double a=scaner.nextDouble();
//            if(i%2==1)
//            {
//                a=a*-1;
//            }
//            int sil=1;
//            for(int j=1;j<=i;j++)
//            {
//                sil=sil*j;
//            }
//            System.out.println(sil);
//            suma = suma + (a/sil);
//        }
//        System.out.println(suma);
        //zad 1.2
//        Scanner scaner = new Scanner(System.in);
//        int n = scaner.nextInt();
//        double a1=scaner.nextDouble();
//        double[] tab = new double[n-1];
//        for(int i=0;i<n-1;i++)
//        {
//            tab[i]=scaner.nextDouble();
//        }
//        for(int i=0;i<n-1;i++)
//        {
//            System.out.println(tab[i]);
//        }
//        System.out.println(a1);
        // zad 2.2
//        Scanner scaner = new Scanner(System.in);
//        double suma=0;
//        int n = scaner.nextInt();
//        for(int i=0;i<n;i++)
//        {
//            double a=scaner.nextDouble();
//            if(a>0)
//            {
//                suma=suma + 2*a;
//            }
//            else
//            {
//                suma = suma + a;
//            }
//        }
//        System.out.println(suma);
        // zad 2.3
//        Scanner scaner = new Scanner(System.in);
//        int dod=0;
//        int zero=0;
//        int uj=0;
//        int n=scaner.nextInt();
//        for(int i=0;i<n;i++)
//        {
//            double a=scaner.nextDouble();
//            if(a>0)
//            {
//                dod++;
//            }
//            else
//            {
//                if(a==0)
//                {
//                    zero++;
//                }
//                else
//                {
//                    uj++;
//                }
//            }
//        }
//        System.out.println("Dodatnie: " + dod  +"\nZera: "+zero +"\nUjemne: "+uj);
        // zad 2.4
//        Scanner scaner = new Scanner(System.in);
//        int n=scaner.nextInt();
//        double maks=0;
//        double mini=0;
//        for(int i=0;i<n;i++)
//        {
//            double a=scaner.nextDouble();
//            if(i==0)
//            {
//                maks=a;
//                mini=a;
//            }
//            else
//            {
//                if(a>maks)
//                {
//                    maks=a;
//                }
//                else
//                {
//                    if(a<mini)
//                    {
//                        mini=a;
//                    }
//                }
//            }
//        }
//        System.out.println("Maksymalna: "+maks+"\nMinimalna: "+mini);
        // zad 2.5
//        Scanner scaner = new Scanner(System.in);
//        int n=scaner.nextInt();
//        int pary=0;
//        double b=0;
//        for(int i=0;i<n;i++)
//        {
//            double a=scaner.nextDouble();
//            if(i==0)
//            {
//                b=a;
//            }
//            else
//            {
//                if(b>0 && a>0)
//                {
//                    pary++;
//                }
//                b=a;
//            }
//        }
//        System.out.println(pary);
    }
}
