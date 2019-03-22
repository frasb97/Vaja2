import Classes.Artikel;
import Classes.Artikli;
import Classes.Racun;

import java.util.ArrayList;
import java.util.Date;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        int[] ean1 = {1, 4, 5, 4, 7, 5, 4, 3, 2, 7, 8, 7};
        int[] ean2 = {5, 5, 4, 3, 7, 3, 2, 5, 3, 2, 1, 1};
        int[] ean3 = {9, 9, 8, 7, 5, 6, 4, 2, 3, 4, 5, 2};
        int[] ean4 = {1, 1, 2, 3, 2, 1, 5, 3, 2, 1, 4, 1};

        Artikel artikel1 = new Artikel("Pomaranca", 5, ean1, 0.095);
        Artikel artikel2 = new Artikel("Klobasa", 2, ean2, 0.095);
        Artikel artikel3 = new Artikel("Mandarine", 4, ean3, 0.095);
//        System.out.println(artikel1.toString());
//        System.out.println(artikel2.toString());
//        System.out.println(artikel3.toString());

        ArrayList<Artikel> artikli_seznam = new ArrayList<Artikel>();
        artikli_seznam.add(artikel1);
        artikli_seznam.add(artikel2);
        artikli_seznam.add(artikel2);
        artikli_seznam.add(artikel3);
        artikli_seznam.add(artikel3);
        artikli_seznam.add(artikel3);
        artikli_seznam.add(artikel1);
        artikli_seznam.add(artikel1);
        artikli_seznam.add(artikel3);
        artikli_seznam.add(artikel3);
        artikli_seznam.add(artikel2);
        artikli_seznam.add(artikel1);

        Artikli artikli1 = new Artikli(artikli_seznam);
//        artikli1.dodajArtikel(artikel1);
//        artikli1.dodajArtikel(artikel1);
//        artikli1.dodajArtikel(artikel1);

//        artikli1.izpis();
//        System.out.println(artikli1.getKolicina());
//
//        System.out.println("-------------------------------");

//        Artikli artikli2 = new Artikli();
//        artikli2.dodajArtikel(artikel2);
//        artikli2.dodajArtikel(artikel2);
//        artikli2.dodajArtikel(artikel2);
//        artikli2.dodajArtikel(artikel2);
//        artikli2.dodajArtikel(artikel2);


//        artikli2.izpis();
//        System.out.println(artikli2.getKolicina());

//        System.out.println("-------------------------------");

//        Artikli artikli3 = new Artikli();
//        artikli3.dodajArtikel(artikel3);
//        artikli3.dodajArtikel(artikel3);
//        artikli3.dodajArtikel(artikel3);
//        artikli3.dodajArtikel(artikel3);

//        artikli3.izpis();
//        System.out.println(artikli3.getKolicina());

//        ArrayList<Artikli> newlist = new ArrayList<Artikli>();
//        newlist.add(artikli1);
//        newlist.add(artikli2);
//        newlist.add(artikli3);

        String izdajatelj1 = "Karba MGE";
        Date datum1 = new Date(2010, 10, 10);
        int id1 = 314;
        int ddv1 = 3353;
        Racun racun1 = new Racun(izdajatelj1, datum1, id1, ddv1, artikli_seznam);

//        SortedMap <Artikel, Integer> sorted = new TreeMap<Artikel, Integer>();



//        System.out.println(racun1.skupniZnesek());
//        System.out.println("--------------------------------");

//        artikli1.odstraniArtikel(artikel1);

//        System.out.println(racun1.skupniZnesek());

        System.out.println("--------------------------------");

//        Artikel artikel4 = new Artikel("Coca-cola", 12, ean4, 0.095);
//        Artikli artikli4 = new Artikli();
//        artikli4.dodajArtikel(artikel4);
//        artikli4.dodajArtikel(artikel4);
//        artikli4.dodajArtikel(artikel4);
//        newlist.add(artikli4);
//        System.out.println(racun1.skupniZnesek());
//
//        ArrayList<Racun> seznam_racunov = new ArrayList<Racun>();
//        seznam_racunov.add(racun1);
    }
}
