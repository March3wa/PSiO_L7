package Zad_Int_3;

public class Parking {

    Pojazd [] pojazdy = new Pojazd[0];
    Pojazd [] pojazdyZarejestrowane = new Pojazd[0];
    Pojazd [] pojazdyNaParkingu = new Pojazd[0];
    String nazwaP;

    Parking(String nazwaP){
        this.nazwaP=nazwaP;
    }
    public String toString(){
        return "Parking "+ nazwaP;
    }
    void wszystkiepojazdy(Pojazd p) {
        Pojazd[] tab = new Pojazd[pojazdy.length + 1];
        for (int i = 0; i < pojazdy.length; i++) {
            tab[i] = pojazdy[i];
        }
        tab[tab.length - 1] = p;
        pojazdy = tab;
    }
    Pojazd zwrocPojazdZRejestracji(String rejestracja) {
        for (int i = 0; i < pojazdy.length; i++) {
            if (pojazdy[i].numerRejestracyjny().equals(rejestracja)) {
                return pojazdy[i];
            }
        }
        return null;
    }
    void zarejestrujPojazd(String nrRej) {
        int temp = pojazdyZarejestrowane.length;
        if (pojazdyZarejestrowane.length==0) {
                Pojazd[] tab = new Pojazd[pojazdyZarejestrowane.length + 1];
                tab[tab.length - 1] = zwrocPojazdZRejestracji(nrRej);
                pojazdyZarejestrowane = tab;
        }
        else if(pojazdyZarejestrowane.length>0) {
            int counter=0;
            for (int i = 0; i < pojazdyZarejestrowane.length; i++) {
                if (!pojazdyZarejestrowane[i].numerRejestracyjny().equals(nrRej)) {
                    counter++;
                }
            }
            if (pojazdyZarejestrowane.length==counter) {
                Pojazd[] tab = new Pojazd[pojazdyZarejestrowane.length + 1];
                for (int j = 0; j < pojazdyZarejestrowane.length; j++) {
                    tab[j] = pojazdyZarejestrowane[j];
                }
                tab[tab.length - 1] = zwrocPojazdZRejestracji(nrRej);
                pojazdyZarejestrowane = tab;
            }
            else {
                System.out.println("Próbujesz wpisać pojazd o rejestracji: "+nrRej+"."+" W spisie już znajduje się taki pojazd!");
            }
        }
    }
    boolean czyPojazdZarejestrowany(Pojazd p){
        boolean czyZarejestrowany = false;
        for (int i = 0; i < pojazdyZarejestrowane.length; i++) {
            if(p.numerRejestracyjny().equals(pojazdyZarejestrowane[i].numerRejestracyjny())){
                czyZarejestrowany = true;
                break;
            }
        }
        return czyZarejestrowany;
    }
    boolean czyPojazdZnajdujeSieNaParkingu(Pojazd p){
        boolean znajdujeSie = false;
        for (int i = 0; i < pojazdyNaParkingu.length; i++) {
            if(p.numerRejestracyjny().equals(pojazdyNaParkingu[i].numerRejestracyjny())){
                znajdujeSie = true;
                break;
            }
        }
        return znajdujeSie;
    }
    void rejestracjaWjazduPojazdu(Pojazd p){
        if(!czyPojazdZarejestrowany(p)){
            System.out.println("Pojazd o rejestracji " + p.numerRejestracyjny() + " nie jest zarejestrowany na tym parkingu!");
        }
        else if (czyPojazdZnajdujeSieNaParkingu(p)){
            System.out.println("Pojazd o rejestracji " + p.numerRejestracyjny() + " znajduje się już na parkingu!");

        }
    }
}
