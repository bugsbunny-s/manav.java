import java.util.Scanner;
public class manav {
    public static void main(String[] args){
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5;

        Scanner inp = new Scanner(System.in);
        
        System.out.print("Kaç kilo Armut istersiniz : ");
        armut *= inp.nextDouble();

        System.out.print("Kaç kilo elma istersiniz : ");
        elma *= inp.nextDouble();

        System.out.print("Kaç kilo domates istersiniz : ");
        domates *= inp.nextDouble();

        System.out.print("Kaç kilo Muz istersiniz : ");
        muz *= inp.nextDouble();

        System.out.print("Kaç kilo patlıcan istersiniz : ");
        patlıcan *= inp.nextDouble();

        double toplam = (armut + elma + domates + muz + patlıcan);

        System.out.println("Toplam tutarınız : " + toplam);
    }
}