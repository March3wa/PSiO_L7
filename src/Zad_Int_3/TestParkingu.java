package Zad_Int_3;

public class TestParkingu {
    public static void main(String[] args) {
        Pojazd pojazd1 = new Samochod("Audi", "DW 09845");
        Pojazd pojazd2 = new Samochod("Renault", "DWR 0345");
        Pojazd pojazd3 = new Samochod("Toyota", "DW 41235");
        Pojazd pojazd4 = new Samochod("Mercedes", "DW 82335");
        Pojazd pojazd5 = new Samochod("BMW", "DWR 1129");
        Pojazd pojazd6 = new Motocykl("Honda", "DW 3186");
        Pojazd pojazd7 = new Motocykl("Suzuki", "DWR 6349");

        Parking p1 = new Parking("C13");
        Parking p2 = new Parking("D20");
        Parking p3 = new Parking("WROńskiego");
        Parking [] parkingi = {p1, p2, p3};

        p1.wszystkiepojazdy(pojazd1);
        p1.wszystkiepojazdy(pojazd2);
        p1.wszystkiepojazdy(pojazd3);
        p1.wszystkiepojazdy(pojazd4);
        p1.wszystkiepojazdy(pojazd5);
        p1.wszystkiepojazdy(pojazd6);
        p1.wszystkiepojazdy(pojazd7);

        p2.wszystkiepojazdy(pojazd1);
        p2.wszystkiepojazdy(pojazd2);
        p2.wszystkiepojazdy(pojazd3);
        p2.wszystkiepojazdy(pojazd4);
        p2.wszystkiepojazdy(pojazd5);
        p2.wszystkiepojazdy(pojazd6);
        p2.wszystkiepojazdy(pojazd7);

        p3.wszystkiepojazdy(pojazd1);

        p3.zarejestrujPojazd(pojazd1.numerRejestracyjny());
        p1.zarejestrujPojazd(pojazd2.numerRejestracyjny());
        p1.zarejestrujPojazd(pojazd3.numerRejestracyjny());
        p1.zarejestrujPojazd(pojazd5.numerRejestracyjny());
        p2.zarejestrujPojazd(pojazd3.numerRejestracyjny());
        p2.zarejestrujPojazd(pojazd6.numerRejestracyjny());
        p2.zarejestrujPojazd(pojazd7.numerRejestracyjny());

        p1.rejestracjaWjazduPojazdu(pojazd2.numerRejestracyjny());
        p1.rejestracjaWjazduPojazdu(pojazd3.numerRejestracyjny());
        p2.rejestracjaWjazduPojazdu(pojazd2.numerRejestracyjny());
        p2.rejestracjaWjazduPojazdu(pojazd3.numerRejestracyjny());
        p2.rejestracjaWjazduPojazdu(pojazd4.numerRejestracyjny());
        p1.rejestracjaWjazduPojazdu(pojazd2.numerRejestracyjny());
        p2.rejestracjaWjazduPojazdu(pojazd6.numerRejestracyjny());

        p1.wyswietlPojazdyZarejestrowane(p1);
        p1.wyswietlPojazdyNaParkingu(p1);
        p2.wyswietlPojazdyZarejestrowane(p2);
        p2.wyswietlPojazdyNaParkingu(p2);
        p3.wyswietlPojazdyZarejestrowane(p3);
        p3.wyswietlPojazdyNaParkingu(p3);

        System.out.println("\nPojazd Honda opuszcza Parking");
        p2.rejestracjaWyjazduPojazdu(pojazd6);
        System.out.println("Próba rejestracji wyjazdu Hondy");
        p2.rejestracjaWyjazduPojazdu(pojazd6);

        p2.wyswietlPojazdyZarejestrowane(p2);
        p2.wyswietlPojazdyNaParkingu(p2);

        KtoryParking kt = new KtoryParking();
        kt.ktoryParkingWybrac(p1, p2, p3);

    }
}
