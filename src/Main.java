import Classes.Artikel;
import Classes.Artikli;
import Classes.Racun;

import java.util.ArrayList;
import java.util.Date;
import java.util.SortedMap;
import java.util.TreeMap;

import static Classes.Artikel.checkDigit;

public class Main {
    public static void main(String[] args) {
        int[] ean1 = {5, 0, 1, 2, 3, 4, 5, 7, 6, 4, 2, 1, 4};
        int[] ean2 = {5, 5, 4, 3, 7, 3, 2, 5, 3, 2, 1, 1, 1};
        int[] ean3 = {6, 2, 9, 1, 0, 4, 1, 5, 0, 0, 2, 1, 3};
        int[] ean4 = {1, 1, 2, 3, 2, 1, 5, 3, 2, 1, 4, 1};

//        501234576421
//        554373253211

        System.out.println("Rezultat preverjanja ean: " + checkDigit(ean3));

        Artikel artikel1 = new Artikel("Pomaranca", 5);
        Artikel artikel2 = new Artikel("Klobasa", 2);
        Artikel artikel3 = new Artikel("Mandarine", 4);
//        Artikel artikel4 = new Artikel("Jabolko", 7, ean4, 0.095);
        System.out.println(artikel1.toString());
        System.out.println(artikel2.toString());
        System.out.println(artikel3.toString());



        ArrayList<Artikel> artikli_seznam = new ArrayList<Artikel>();
        artikli_seznam.add(artikel1);
        artikli_seznam.add(artikel2);
        artikli_seznam.add(artikel3);

        for(int i = 0; i < artikli_seznam.size(); i++)
        {
            if(artikli_seznam.get(i).search("Mandarine"))
                System.out.println("Element najden!");
        }

        System.out.println("--------------------------------");

        String izdajatelj1 = "Karba MGE";
        Date datum1 = new Date(2010, 10, 10);
        int id1 = 314;
        int ddv1 = 3353;
        Racun racun1 = new Racun(izdajatelj1, datum1, id1, ddv1, artikli_seznam);
        System.out.println(racun1.skupniZnesek());

        racun1.dodajArtikel(artikel1);
        System.out.println(racun1.skupniZnesek());
        System.out.println(artikel1.toString());
        System.out.println("--------------------------------");
//        ArrayList<Racun> seznam_racunov = new ArrayList<Racun>();
//        seznam_racunov.add(racun1);
    }
}
