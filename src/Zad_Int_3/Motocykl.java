package Zad_Int_3;

public class Motocykl extends Pojazd {
    String marka;
    String nrRejestracyjny;

    Motocykl(String marka, String nr){
        super(marka, nr);
    }
    public String toString() {
        return "Motocykl: " + getMarka()+", " + "nrRejestracyjny: " + numerRejestracyjny();
    }
}

