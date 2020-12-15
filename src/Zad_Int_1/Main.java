package Zad_Int_1;

import Zad_Int_1.Funkcja.F2x;
import Zad_Int_1.Funkcja.Fsinx;

public class Main {
    public static void main(String[] args) {
        Tabela tab1 = new Tabela(new F2x(), 0, 10 ,5);
        System.out.println(tab1);
        System.out.println("======================");
        Tabela tab2 = new Tabela(new Fsinx(), 0, 2*Math.PI, 4);
        System.out.println(tab2);
    }
}
