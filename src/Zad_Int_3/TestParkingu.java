package Zad_Int_3;

public class TestParkingu {
    public static void main(String[] args) {
        Pojazd pojazd1 = new Samochod("Audi", "DW 09845");
        Pojazd pojazd2 = new Samochod("Renault", "DWR 0345");
        Pojazd pojazd3 = new Samochod("Toyota", "DW 41235");
        Pojazd pojazd4 = new Samochod("Mercedes", "DW 82335");
        Pojazd pojazd5 = new Samochod("BMW", "DWR 1129");
        Pojazd pojazd6 = new Motocykl("Honda", "DW 3186");

        Parking p1 = new Parking("C13");

        p1.wszystkiepojazdy(pojazd1);
        p1.wszystkiepojazdy(pojazd2);
        p1.wszystkiepojazdy(pojazd3);
        p1.wszystkiepojazdy(pojazd4);
        p1.wszystkiepojazdy(pojazd5);
        p1.wszystkiepojazdy(pojazd6);

        p1.zarejestrujPojazd(pojazd2.numerRejestracyjny());
        p1.zarejestrujPojazd(pojazd3.numerRejestracyjny());
        p1.zarejestrujPojazd(pojazd5.numerRejestracyjny());
        p1.zarejestrujPojazd(pojazd3.numerRejestracyjny());
        p1.zarejestrujPojazd(pojazd6.numerRejestracyjny());

        System.out.println(p1);
        for (int i = 0; i < p1.pojazdyZarejestrowane.length; i++) {
            System.out.println(p1.pojazdyZarejestrowane[i]);
        }
    }
}
