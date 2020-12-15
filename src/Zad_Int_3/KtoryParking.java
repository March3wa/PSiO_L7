package Zad_Int_3;

public class KtoryParking{
    void ktoryParkingWybrac(Parking p1, Parking p2, Parking p3){
        //przyjmuję krótsze nazwy
        int il1 = p1.pojazdyNaParkingu.length;
        int il2 = p2.pojazdyNaParkingu.length;
        int il3 = p3.pojazdyNaParkingu.length;
        if (il1<il2 && il1<il3){
            System.out.println("Najwięcej wolnego miejsca jest na parkingu " + p1);
        }
        else if (il2<il1 && il2<il3){
            System.out.println("Najwięcej wolnego miejsca jest na parkingu " + p2);
        }
        else {
            System.out.println("Najwięcej wolnego miejsca jest na parkingu " + p3);
        }
    }
}
