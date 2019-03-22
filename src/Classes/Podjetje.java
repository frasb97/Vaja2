package Classes;

import Interfaces.Searchable;

public class Podjetje implements Searchable {
    private String ime;
    private int davcna_st;
    private int maticna_st;
    private boolean je_ddv_zavezanec;

    public Podjetje(String imeX, int davcnaX, int maticnaX, boolean zavezanec)
    {
        ime = imeX;
        davcna_st = davcnaX;
        maticna_st = maticnaX;
        je_ddv_zavezanec = zavezanec;
    }

    public String getIme() { return ime; }
    public int getDavcna_st() { return davcna_st; }
    public int getMaticna_st() { return maticna_st; }
    public boolean getZavezanec() { return je_ddv_zavezanec; }

    public void setIme(String novoime) {this.ime = novoime; }
    public void setDavcna_st(int novadavcna) { this.davcna_st = novadavcna; }
    public void setMaticna_st(int novamaticna) { this.maticna_st = novamaticna; }
    public void setZavezanec(boolean novizavezanec) { this.je_ddv_zavezanec = novizavezanec; }


    public boolean search(String iskano_ime) {
        if(this.ime == iskano_ime) return true;
        else return false;
    }
}
