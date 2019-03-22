package Classes;

import java.util.*;

public class Artikli {
    protected ArrayList<Artikel> artikli_seznam;
//    private int kolicina;
//    Map<Artikel, Integer> urejen_seznam = new HashMap<Artikel, Integer>();
// Namesto HashMap SortedMap
    public Artikli(ArrayList<Artikel> seznamX)
    {
        artikli_seznam = seznamX;
//        artikli_seznam.add(new Artikel("Coca-cola", 4));
//        artikli_seznam.add(new Artikel("Coca-cola", 4));
//        artikli_seznam.add(new Artikel("Coca-cola", 4));
//        artikli_seznam.add(new Artikel("Coca-cola", 4));
//        kolicina = 0;

    }

//    public int getKolicina()
//    {
//        return kolicina;
//    }

    public ArrayList<Artikel> getArtikli_seznam() {
        return artikli_seznam;
    }

    public void dodajArtikel(Artikel noviartikel)
    {
        artikli_seznam.add(noviartikel);
//        kolicina += 1;
    }

    public void odstraniArtikel(Artikel artikel)
    {
        artikli_seznam.remove(artikel);
//        kolicina -= 1;


//        Map<Artikel, Integer> urejen_seznam = new HashMap<Artikel, Integer>();
//        Set<Artikel> unique = new HashSet<Artikel>(urejen_seznam.keySet());
//        for (Artikel art : unique)
//        {
////            System.out.println(art.toString() + ": " + Collections.frequency(seznam_art, art));
//            urejen_seznam.put(art, Collections.frequency(urejen_seznam.keySet(), art));
//        }
    }

    public void izpis()
    {
        for (Artikel art : artikli_seznam)
        {
            System.out.println(art.toString());
        }

    }



    ///////////////////////////////////////////////////////////////////
//    public Artikli(ArrayList<Artikel> artikli)
//    {
//        if (!artikli_seznam.isEmpty())
//            kolicina += 1;
//
//        artikli_seznam = artikli;



//        Set<Artikel> unique = new HashSet<Artikel>(artikli);
//        for (Artikel art : unique)
//        {
////            System.out.println(art.toString() + ": " + Collections.frequency(seznam_art, art));
//            urejen_seznam.put(art, Collections.frequency(artikli, art));
//        }
//    }



//    public Map<Artikel, Integer> uredi_seznam(ArrayList<Artikel> seznam_art)
//    {
//        Map<Artikel, Integer> temp = new HashMap<Artikel, Integer>();
//
//        Set<Artikel> unique = new HashSet<Artikel>(seznam_art);
//        for (Artikel art : unique)
//        {
////            System.out.println(art.toString() + ": " + Collections.frequency(seznam_art, art));
//            temp.put(art, Collections.frequency(seznam_art, art));
//        }
//        return temp;
//    }
}
