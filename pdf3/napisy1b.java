import java.util.Scanner;

public class napisy1b {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String napis = scanner.nextLine();
        String napis2 = scanner.nextLine();
        System.out.println(countSubStr(napis2, napis));

    }
    public static int countSubStr(String str, String subStr)
    {
        int licznik=0;
        for(int i=0;i<str.length();i++)
        {
            i=str.indexOf(subStr,i);
            if(i==-1)
                break;
            licznik++;
        }
        return licznik;
    }
}
