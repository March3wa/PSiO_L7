package Zad_Int_1;

import Zad_Int_1.Funkcja.Funkcja;
import java.text.DecimalFormat;

public class Tabela {


    Funkcja fun;
    double xp, xk, n, dx;

    Tabela(Funkcja f, double xp, double xk, double n){
        fun = f;
        this.xp = xp;
        this.xk= xk;
        this.n = n;
        this.dx = ((xk-xp)/n);
    }
    public String toString (){
        String s = fun.wzor()+"\n" + "x     "+"f(x)"+"\n";
        double x = xp;
        DecimalFormat skroc = new DecimalFormat("0.#####");
        for (int i = 0; i <= n; i++) {
            s+= skroc.format(x) +"   "+ skroc.format(fun.fW(x))+"\n";
            x+=this.dx;
        }
//        while(x<=xk){
//            s+= x +"     "+ fun.fW(x)+"\n";
//            x+=dx;
//        }
//        do{
//            s+= x +"     "+ fun.fW(x)+"\n";
//            x+=dx;
//        }
//        while(x<=xk);
    return s;
    }
}
