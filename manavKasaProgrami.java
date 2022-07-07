import java.util.Scanner;

public class manavKasaProgrami {
    public static void main(String[] args) {
        double a , m , e , p , toplamUcret;
     Scanner inp = new Scanner(System.in);

        System.out.print("Armut`un kilosunu giriniz :  " );
        a = inp.nextDouble();

        System.out.print("Elma`nin kilosunu giriniz :  " );
        e = inp.nextDouble();

        System.out.print("Muz`un kilosunu giriniz :  " );
        m = inp.nextDouble();

        System.out.print("Patlicanin`nin kilosunu giriniz :  " );
        p = inp.nextDouble();

        double a1 = 2.14, e1 = 3.17, m1 = 0.95, p1 = 5;
        double af = a * a1, ef = e * e1, mf = m * m1, pf = p * p1;
        toplamUcret = (af + ef + mf + pf);

        System.out.println("Armut'un fiyati:  " + af);
        System.out.println("Elma'nın fiyati:  " + ef);
        System.out.println("Muz'un fiyati:    " + mf);
        System.out.println("Patlicanin fiyati:"  + pf);

        System.out.println("toplam tutar:   " + toplamUcret);






    }
}
