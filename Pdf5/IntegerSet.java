public class IntegerSet {
    IntegerSet(){
        for(int i=0;i<100;i++)
        {
            liczby[i]=false;
        }
    }
    IntegerSet(int liczba){
        for(int i=0;i<100;i++)
        {
            liczby[i]=false;
            if(i==liczba-1)
                liczby[i]=true;
        }
    }
    boolean[] liczby = new boolean[100];
    static void union(IntegerSet tab, IntegerSet tab2){
        int licznik=0;
        for(int i=0;i<100;i++){
            if(tab.liczby[i]==true || tab2.liczby[i]==true) {
                System.out.print(i + 1 + " ");
                licznik++;
            }
        }
        if(licznik==0)
            System.out.println("None");
        else
            System.out.print("\n");
    }
    static void intersection(IntegerSet tab, IntegerSet tab2){
        int licznik=0;
        for(int i=0;i<100;i++){
            if(tab.liczby[i]==true && tab2.liczby[i]==true) {
                System.out.print(i + 1 + " ");
                licznik++;
            }
        }
        if(licznik==0)
            System.out.println("None");
        else
            System.out.print("\n");
    }
    void insertElement(int liczba){
        if(liczba<1 || liczba>100) {
            System.out.println("Blad, wprowadzono liczbe spoza zakresu.");
            return;
        }
        liczby[liczba-1]=true;
    }
    void deleteElement(int liczba){
        if(liczba<1 || liczba>100) {
            System.out.println("Blad, wprowadzono liczbe spoza zakresu.");
            return;
        }
        liczby[liczba-1]=false;
    }
    public String toString(){
        String li="";
        for(int i=0;i<100;i++)
        {
            if(liczby[i]==true){
                li += i+1+" ";
            }
        }
        return li;
    }
    void equals(IntegerSet tab){
        for(int i=0;i<100;i++) {
            if (liczby[i] != tab.liczby[i]){
                System.out.println("Zbiory nie sa identyczne.");
                return;
            }
        }
        System.out.println("Zbiory sa identyczne.");
    }


}
