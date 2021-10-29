import java.util.Scanner;

public class napisy1d {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String napis = scanner.nextLine();
        int n = scanner.nextInt();
        System.out.println(reapeat(napis,n));
    }
    public static String reapeat(String str, int n)
    {
        String nowy = "";
        for(int i=0;i<n;i++)
        {
            nowy = nowy.concat(str);
        }

        return nowy;
    }
}
