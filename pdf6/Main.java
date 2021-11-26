package pl.imiajd.goralski;

public class Main {
    public static void main(String[] args){
        Adres a1 = new Adres("Kolce", "10-012", "warszawska",5, 2);
        Adres a2 = new Adres("Chojniki", "11-002", "Ostrawy", 7, 8);
        System.out.println(a1.przed(a2));
        Osoba o1 = new Osoba("Marek", 1998);
        Student s1 = new Student(o1,"Matematyka");
        Nauczyciel n1 = new Nauczyciel(o1, 1900);
        System.out.println(o1.toString());
        System.out.println(s1.toString());
        BetterRectangle p=new BetterRectangle(2,4);
        System.out.println(p.getArea());
        }
    }

