
package Classes;

import Interfaces.Searchable;

import java.util.*;


public class Racun implements Searchable {
    private String izdajatelj;
    private Date datum;
    private int id;
    private int ddv_id;
    private ArrayList<Artikel> seznam_racun;

    public Racun(String izdajateljX, Date datumX, int idX, int ddv_idX, ArrayList<Artikel> seznamX)
    {
        izdajatelj = izdajateljX;
        id = idX;
        datum = datumX;
        ddv_id = ddv_idX;
        seznam_racun = seznamX;
    }

    public String getIzdajatelj() { return izdajatelj; }
    public int getId() { return id; }
    public Date getDatum() { return datum; }
    public int getDdv_id() { return ddv_id; }

    public void setIzdajatelj(String newIzdajatelj) { this.izdajatelj = newIzdajatelj; }
    public void setId(int newId) { this.id = newId; }
    public void setDatum(Date newDatum) { this.datum = newDatum; }
    public void setDdv_id(int newDdv_id) { this.ddv_id = newDdv_id; }

    public boolean search(String ime) {
        if(this.getIzdajatelj() == ime) return true;
        else return false;
    }

    public void dodajArtikel(Artikel e)
    {
        int index;

        if(seznam_racun.contains(e))
        {
            index = seznam_racun.indexOf(e);
            seznam_racun.get(index).setKolicina(seznam_racun.get(index).getKolicina() + 1);
        }
        else
            seznam_racun.add(e);
    }

    public void odstraniArtikel(Artikel e)
    {
        int index = seznam_racun.indexOf(e);
        if(seznam_racun.get(index).getKolicina() < 1)
            seznam_racun.remove(e);
        else
            seznam_racun.get(index).setKolicina(seznam_racun.get(index).getKolicina() - 1);
    }


    public int skupniZnesek()
    {
        int cena_skupaj = 0;

        for (int i = 0; i < seznam_racun.size(); i++)
        {
            cena_skupaj += seznam_racun.get(i).getCena() * seznam_racun.get(i).getKolicina();
        }
        return cena_skupaj;
    }
}
