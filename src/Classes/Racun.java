
package Classes;

import Interfaces.Searchable;

import java.util.*;


public class Racun implements Searchable {
    private String izdajatelj;
    private Date datum;
    private int id;
    private int ddv_id;
    //    private ArrayList<Artikli> seznam_racun;
    Map<Artikel, Integer> seznam_racun;

//    Map<Artikel, Integer> seznam_racun;


    public boolean search(String ime) {
        if(this.getIzdajatelj() == ime) return true;
        else return false;
    }

    public Racun(String izdajateljX, Date datumX, int idX, int ddv_idX, ArrayList<Artikel> seznamX)
    {
        izdajatelj = izdajateljX;
        id = idX;
        datum = datumX;
        ddv_id = ddv_idX;

        Set<Artikel> unique = new HashSet<Artikel>(seznamX);
        for (Artikel art : unique)
        {
//            System.out.println(art.toString() + ": " + Collections.frequency(seznamX, art));
            seznam_racun.put(art, Collections.frequency(seznamX, art));
        }
    }


    public String getIzdajatelj() { return izdajatelj; }
    public int getId() { return id; }
    public Date getDatum() { return datum; }
    public int getDdv_id() { return ddv_id; }

    public void setIzdajatelj(String newIzdajatelj) { this.izdajatelj = newIzdajatelj; }
    public void setId(int newId) { this.id = newId; }
    public void setDatum(Date newDatum) { this.datum = newDatum; }
    public void setDdv_id(int newDdv_id) { this.ddv_id = newDdv_id; }


    public int skupniZnesek()
    {
        int cena_skupaj = 0;
//        for (int i = 0; i < seznam_racun.size(); i++)
//        {
//            for (int j = 0; j < seznam_racun.get(i).artikli_seznam.size(); j++)
//            {
//                cena_skupaj = cena_skupaj + seznam_racun.get(i).artikli_seznam.get(j).getCena();
//            }
//        }
//        return cena_skupaj;



        for (Artikel art : seznam_racun.keySet())
        {
            cena_skupaj = cena_skupaj + art.getCena() * seznam_racun.get(art);
        }
        return cena_skupaj;
    }
}
