import java.util.Scanner;

public class ManavOdevi {
    public static void main(String[] args) {

        double armut = 2.14, armutKilo, armutFiyat;
        double elma = 3.67, elmaKilo, elmaFiyat;
        double domates = 1.11, domatesKilo, domatesFiyat;
        double muz = 0.95, muzKilo, muzFiyat;
        double patlican = 5, patlicanKilo, patlicanFiyat;
        double toplamTutar;

        Scanner emp = new Scanner(System.in);

        System.out.println("Armut kilo fiyatı : " + 2.14 + " Tl");
        System.out.println("Elma kilo fiyatı : " + 3.67 + " Tl");
        System.out.println("Domates kilo fiyatı : " + 1.11 + " Tl");
        System.out.println("Muz kilo fiyatı : " + 0.95 + " Tl");
        System.out.println("Patlıcan kilo fiyatı : " + 5 + " Tl");
        
        System.out.print("Armut kilo : ");
        armutKilo = emp.nextDouble();
        armutFiyat = armutKilo * armut;
        System.out.println("Armut fiyatı : " + armutFiyat);

        
        System.out.print("Elma ilo : ");
        elmaKilo = emp.nextDouble();
        elmaFiyat = elmaKilo * elma;
        System.out.println("Elma fiyatı : " + elmaFiyat);


        System.out.print("Domates kilo : ");
        domatesKilo = emp.nextDouble();
        domatesFiyat = domatesKilo * domates;
        System.out.println("Domates fiyatı : " + domatesFiyat);


        System.out.print("Muz kilo : ");
        muzKilo = emp.nextDouble();
        muzFiyat = muzKilo * muz;
        System.out.println("Muz fiyatı : " + muzFiyat);


        System.out.print("Patlıcan kilo : ");
        patlicanKilo = emp.nextDouble();
        patlicanFiyat = patlicanKilo * patlican;
        System.out.println("Patlıcan fiyatı : " + patlicanFiyat);

        toplamTutar = armutFiyat + elmaFiyat + domatesFiyat + muzFiyat + patlicanFiyat;
        System.out.println("Toplam tutarınız : " + toplamTutar + " Tl");
    }
}
