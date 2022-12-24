import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int matematik, fizik, turkce , kimya ,muzik ;

    Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        matematik = input.nextInt();
        if (matematik < 0 || matematik > 100){
            matematik=0;

        }
        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();
        if (fizik < 0 || fizik > 100){
            fizik = 0;
        }
        System.out.print("Türkçe Notunuz  : ");
        turkce = input.nextInt();
        if (turkce < 0 || turkce > 100 ){
            turkce = 0;
        }
        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();
        if (kimya < 0 || kimya > 100){
            kimya = 0;
        }
        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();
        if (muzik < 0 || muzik > 100)
            muzik = 0;

        double ortalama = (matematik + fizik + turkce + kimya + muzik) / 5 ;
        if (ortalama <= 55){
            System.out.println("SINIFTA KALDIN , GEÇMİŞ OLSUN !");

        }
        else {
            System.out.println("BAŞARIYLA GEÇTİNİZ ! ");

        }
        System.out.println("ORTALAMANIZ :  "+ ortalama);



  }
}