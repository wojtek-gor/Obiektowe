import java.util.Scanner;

public class napisy1a { public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);
    String znak = scanner.nextLine();
    String napis = scanner.nextLine();
    char znak2 = znak.charAt(0);
    System.out.println(countChar(napis,znak2));
}
public static int countChar(String str, char c)
{
    int licznik = 0;
    for(int i=0; i<str.length();i++)
    {
        i=str.indexOf(c,i);
        if(i==-1)
            break;
        licznik++;
    }
    return licznik;
}
}
