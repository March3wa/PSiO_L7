package Zad_Int_3;

abstract public class Pojazd implements Identyfikacja{

    private String marka;
    private String nrRejestracyjny;

    Pojazd(String marka, String nr){
        this.marka = marka;
        nrRejestracyjny = nr;
    }
    public String getMarka() {
        return marka;
    }
    public String numerRejestracyjny() {
        return nrRejestracyjny;
    }
    abstract public String toString();
}

