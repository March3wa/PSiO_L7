package Zad_Int_3;

public class Samochod extends Pojazd{

    Samochod(String marka, String nrRej){
        super(marka, nrRej);
    }
    public String toString() {
        return "Samochod: " + getMarka()+", " + "nrRejestracyjny: " + numerRejestracyjny();
    }
}
