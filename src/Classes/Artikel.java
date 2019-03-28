package Classes;

import Interfaces.Searchable;

import java.util.Random;

public class Artikel implements Searchable {
    private String ime;
    private int cena;
    private int[] ean;
    private double davcna_stopnja;
    private String drzava;
    private int kolicina;

    public boolean search(String ime) {
        if(this.getIme() == ime) return true;
        else return false;
    }

    public Artikel(String imeX, int cenaX)
    {
        ime = imeX;
        cena = cenaX;
        davcna_stopnja = 0.095;
        kolicina = 1;

        Random rnd = new Random();
        int[] ean = {0,0,0,0,0,0,0,0,0,0,0,0,0};


        for(int i = 0; i < (ean.length) - 1; i++)
        {
            int newNumber = rnd.nextInt(9);
            ean[i] = newNumber;
        }

        ean[12] = calculateCheckDigit(ean);
    }

    public String getIme(){ return ime; }
    public int getCena() { return cena; }
    public int[] getEan(){ return ean; }
    public double getDavcna_stopnja() { return davcna_stopnja; }
    public String getDrzava() { return drzava; }
    public int getKolicina() { return kolicina; }

    public void setIme(String newIme) { this.ime = newIme; }
    public void setCena(int newCena) { this.cena = newCena; }
    public void setEan(int[] newEan) { this.ean = newEan; }
    public void setDavcna_stopnja(double newDavcna_stopnja) { this.davcna_stopnja = newDavcna_stopnja; }
    public void setDrzava(String drzavaX) { this.drzava = drzavaX; }
    public void setKolicina(int kolicinaX) { this.kolicina = kolicinaX; }

    public String eanDrzava(int[] barcode)
    {
        String[] drzave = {"Slovenija", "Francija", "Bulgarija", "Hrvaska", "Bosna in Hercegovina", "Nemcija", "Japonska", "Rusija",
        "Tajvan", "Estonija", "Latvija", "Azerbajdzan", "Litva"};

        return drzave[0];
    }

    static public int round(int n)
    {
        int a = (n / 10) * 10;
        int b = a + 10;
        return ( n - a >= b - n)? b : a;
    }

    public static int calculateCheckDigit(int ean[])
    {
        int soda_vsota = 0, liha_vsota = 0, vsota = 0;

        for(int i = 0; i < (ean.length - 1); i++)
        {
            if(i%2 == 0)
                soda_vsota += ean[i];
            else if (i%2 != 0)
                liha_vsota += ean[i];
        }

        vsota = soda_vsota + liha_vsota  * 3;
        return round(vsota) - vsota;
    }


    public static boolean checkDigit(int[] ean)
    {
        if((calculateCheckDigit(ean)) == ean[12])
            return true;

        return false;
    }


    @Override
    public String toString()
    {
        return "Artikel " + this.getIme() + " s ceno " + this.getCena() + ", EAN koda izdelka "
                 + ", stopnja DDV " + this.getDavcna_stopnja() + "%" + ", kolicina izdelka: " + this.getKolicina();

    }

}
