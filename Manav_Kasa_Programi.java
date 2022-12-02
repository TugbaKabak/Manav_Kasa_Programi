import java.util.Scanner;

public class Manav_Kasa_Programi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double armut= 2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5.00, tutar;

        int armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;

        System.out.println("Kaç kilo armut aldınız? : ");
        armutKilo = input.nextInt();

        System.out.println("Kaç kilo elma aldınız? : ");
        elmaKilo = input.nextInt();

        System.out.println("Kaç kilo domates aldınız? : ");
        domatesKilo = input.nextInt();

        System.out.println("Kaç kilo muz aldınız? : ");
        muzKilo = input.nextInt();

        System.out.println("Kaç kilo patlıcan aldınız? : ");
        patlicanKilo = input.nextInt();

        tutar= (armut*armutKilo)+(elma*elmaKilo)+(domates*domatesKilo)+(muz*muzKilo)+(patlican*patlicanKilo);
        System.out.println("Toplam tutar : "+tutar+" TL");
    }
}
