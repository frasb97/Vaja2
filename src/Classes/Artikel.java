package Classes;

import Interfaces.Searchable;

public class Artikel implements Searchable {
    private String ime;
    private int cena;
    private int[] ean;
    private double davcna_stopnja;
    private String drzava;

    public boolean search(String ime) {
        if(this.getIme() == ime) return true;
        else return false;
    }

    public Artikel(String imeX, int cenaX, int[] eanX, double davcna_stopnjaX)
    {
        ime = imeX;
        cena = cenaX;
        ean = eanX;
        davcna_stopnja = davcna_stopnjaX;
    }

    public String getIme(){ return ime; }
    public int getCena() { return cena; }
    public int[] getEan(){ return ean; }
    public double getDavcna_stopnja() { return davcna_stopnja; }
    public String getDrzava() { return drzava; }

    public void setIme(String newIme) { this.ime = newIme; }
    public void setCena(int newCena) { this.cena = newCena; }
    public void setEan(int[] newEan) { this.ean = newEan; }
    public void setDavcna_stopnja(double newDavcna_stopnja) { this.davcna_stopnja = newDavcna_stopnja; }
    public void setDrzava(String drzavaX) { this.drzava = drzavaX; }

    public String eanDrzava(int[] barcode)
    {
        String[] drzave = {"Slovenija", "Francija", "Bulgarija", "Hrvaska", "Bosna in Hercegovina", "Nemcija", "Japonska", "Rusija",
        "Tajvan", "Estonija", "Latvija", "Azerbajdzan", "Litva"};

        return drzave[0];
    }


    public static boolean checkDigit(int[] ean)
    {
        int soda_vsota = 0, liha_vsota = 0, vsota = 0, primerjava = 0;

        for(int i = 0; i < (ean.length - 1); i++)
        {
            if(i%2 == 0)
                soda_vsota += ean[i];
            else if (i%2 != 0)
                liha_vsota += ean[i];
        }

        vsota = (soda_vsota*3) + liha_vsota;
        primerjava =  vsota + ean[9];

        if((primerjava - vsota) == ean[12])
            return true;

        return false;
    }


    @Override
    public String toString()
    {
        return "Artikel " + this.getIme() + " s ceno " + this.getCena() + ", EAN koda izdelka "
                 + ", stopnja DDV " + this.getDavcna_stopnja() + "%";

    }

}
